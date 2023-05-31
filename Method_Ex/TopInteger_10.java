package Method_Ex;

import java.util.Scanner;

public class TopInteger_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int number = 1; number <= n; number++) {
            if (isContainsOddDigits(number) && isSumOfDigitDivisibleBy8(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isSumOfDigitDivisibleBy8(int number) {
        //suma ot cifri
        int sumDigits = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sumDigits += lastDigit;
            //premahvame poslednata cifra
            number = number / 10;
        }
        //proverka sum/8
        return sumDigits % 8 == 0;
    }

    //metod za nechetna cifra
    public static boolean isContainsOddDigits(int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number = number / 10;
            }
        }
        //vzeli sme vsichki cifri i nikoq ne e bila nechetna
        return false;
    }
}
