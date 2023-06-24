package ObjectAndClasses_Lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr= scanner.nextLine().split(" ");

        Random randomObject=new Random();

        for (int i = 0; i< wordsArr.length ; i++) {
            int rndIndexX= randomObject.nextInt(wordsArr.length);
            int rndIndexY= randomObject.nextInt(wordsArr.length);

            String oldWord=wordsArr[rndIndexX];

            wordsArr[rndIndexX] = wordsArr[rndIndexY];
            wordsArr[rndIndexY] = oldWord;
        }

        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }
}
