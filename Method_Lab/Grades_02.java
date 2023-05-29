package Method_Lab;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());
        printInWords(grade);
    }

    public static void printInWords(double grade2) {
        if (grade2 >= 2.00 && grade2 <= 2.99) {
            System.out.println("Fail");
        } else if (grade2 >= 3 && grade2 <= 3.49) {
            System.out.println("Poor");
        } else if (grade2 >= 3.50 && grade2 <= 4.49) {
            System.out.println("Good");
        } else if (grade2 >= 4.50 && grade2 <= 5.49) {
            System.out.println("Very good");
        } else if (grade2 >= 5.50 && grade2 <= 6.00) {
            System.out.println("Excellent");
        }
    }
}
