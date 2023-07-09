package TextProcessing_Ex;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String secondRow=scanner.nextLine();


        BigInteger firstNum=new BigInteger(first);
        byte secondNum=Byte.parseByte(secondRow);
        System.out.println(firstNum.multiply(new BigInteger(secondNum+"")));

    }
}
