package Method_Ex;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());
        getSumAndSubtrackt(num1,num2,num3);
    }

    private static void getSumAndSubtrackt(int num1,int num2,int num3) {
        int result=(num1+num2)-num3;
        System.out.println(result);
    }
}
