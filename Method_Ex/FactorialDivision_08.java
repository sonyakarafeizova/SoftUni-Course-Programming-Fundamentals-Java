package Method_Ex;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        
       long fact1= getFactorial(num1);
        long fact2=getFactorial(num2);

        double result=fact1*1.0/fact2;
        System.out.printf("%.2f",result);
    }

    private static long getFactorial(int number) {
        long fact=1;
        for (int i = 1 ;i <=number; i++) {
            fact=fact*i;
        }
        return fact;
    }
}
