package Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split(" ");

        int[] numbers=new int[inputArray.length];//noviq masiv procheten ot stariq


        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            boolean isMaxNum=true;
            for (int j = i+1; j < numbers.length ; j++) {
                if(numbers[i]<=numbers[j]){
                    isMaxNum=false;
                    break;
                }
            }
            if(isMaxNum){
                System.out.print(numbers[i]+" ");
            }
        }

    }
}
