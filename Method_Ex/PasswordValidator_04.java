package Method_Ex;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        passwordCheck(password);
    }

    private static void passwordCheck(String password) {
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean containsOnlyLettersAndDigits = true;
        for (char digit1 : password.toCharArray()) {
            if (!Character.isLetterOrDigit(digit1)) {
                containsOnlyLettersAndDigits = false;
                break;
            }
        }
        if (!containsOnlyLettersAndDigits) {
            System.out.println("Password must consist only of letters and digits");
        }
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount < 2) {
            System.out.println("Password must have at least 2 digits");
        }
        if (password.length() >= 6 && password.length() <= 10 && containsOnlyLettersAndDigits && digitCount >= 2) {
            System.out.println("Password is valid");
        }

    }
}
