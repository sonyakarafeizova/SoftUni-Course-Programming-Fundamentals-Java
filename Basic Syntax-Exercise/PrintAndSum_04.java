package BasicSyntax_Ex;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = num1; i <= num2; i++) {
            System.out.printf("%d ",i);
            sum += i;
        }

        System.out.printf("%nSum: %d", sum);

    }
}
