package Method_Ex;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("END")) {
                break;
            }

            if (isPositiveInteger(input)) {
                int number = Integer.parseInt(input);
                boolean isPalindrome = isPalindrome(number);

                if (isPalindrome) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
        }

    }

    public static boolean isPositiveInteger(String input) {
        if (input.matches("\\d+")) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(int number) {
        String numberString = Integer.toString(number);
        int left = 0;
        int right = numberString.length() - 1;

        while (left < right) {
            if (numberString.charAt(left) != numberString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}