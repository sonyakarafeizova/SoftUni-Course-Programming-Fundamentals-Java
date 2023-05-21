package DataTypesAndVariables_Ex;

import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int code = start; code <=end ; code++) {

            System.out.printf((char)code+" ");
        }


    }
}
