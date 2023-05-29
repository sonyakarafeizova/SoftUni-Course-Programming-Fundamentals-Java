package Method_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum=Integer.parseInt(scanner.nextLine());
        String operator= scanner.nextLine();
        int secondNum=Integer.parseInt(scanner.nextLine());

        DecimalFormat df=new DecimalFormat("0.##");

        System.out.println(df.format(calculate(firstNum,operator,secondNum)));
    }
    private static double calculate(int num1,String operator1,int num2){
        double result=0;
        switch(operator1){
            case"/":
                result=num1/num2;
                break;
            case"*":
                result=num1*num2;
                break;
            case"+":
                result=num1+num2;
                break;
            case"-":
                result=num1-num2;
                break;
        }
        return result;
    }
}
