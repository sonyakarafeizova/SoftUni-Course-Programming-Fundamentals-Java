package DataTypesAndVariables_Ex;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum=0;

        while(n>0){

            int lastDigit=n%10;//namirame poslednata cifra
            sum+=lastDigit;
            n=n/10;//premahvame poslednata cifra

        }
        System.out.println(sum);

    }
}
