package Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//vhod-masiv ot chisla i broi rotacii
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());//broi rotacii

        for (int rotation = 1; rotation <=rotations ; rotation++) {

            //1.vzimame purviq element
            int firstElement = numbers[0];
            //2.premestvame vsichki elementi s 1 na lqvo
            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index] = numbers[index + 1];
            }
            //3.slagame na posledna poziciq da e pyrviq vzet element
            numbers[numbers.length - 1] = firstElement;
        }
//printirame masiva
        for (int number:numbers) {
            System.out.print(number+" ");

        }


    }
}
