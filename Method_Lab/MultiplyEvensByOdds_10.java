package Method_Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
getEvenOrOdd(number);
    }
    public static void getEvenOrOdd (int num){
        int evenSum =0;
        int oddSum=0;
        while(num!=0){
            int digit=num%10;

            if(digit%2==0){
                evenSum +=digit;
            }else{
                oddSum+=digit;
            }
            num/=10;
        }
        int result= evenSum *oddSum;

        System.out.println(result);
    }
}
