package Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNUmber = numbers[index];

            int leftSum = 0;
            int rightSum = 0;

            //1. da namerq sumata na elementite v lqvo
            //lqva suma: vsichki elementi ot purviq do nashiq

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbers[leftIndex];
            }

            //2. da namerq sumata na elementite v dqsno

            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1; rightIndex++) {
                rightSum += numbers[rightIndex];
            }

            //3.proverka dali sa ravni sumite
            if (leftSum == rightSum) {
                System.out.println(index);
                return;//prekratqva programata
            }

        }

//obhodili sme vsichki chisla i nikoe ne e otgovorilo na uslovieto
        System.out.println("no");
    }
}
