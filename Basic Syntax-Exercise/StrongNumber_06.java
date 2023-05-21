package BasicSyntax_Ex;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber=number; //purvonachalnata stoinost na chisloto
        int sumFact = 0;
        while (number > 0) {
            int lastDigit = number % 10;//posledna cifra
            //namirame factoriel
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            //sumirame factoriel
            sumFact += fact;

            number = number / 10;
        }

        if (sumFact == startNumber) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

}
