package Method_Ex;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        getMinNumber(num1, num2, num3);
    }

    public static void getMinNumber(int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            System.out.println(num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);

        }
    }
}
