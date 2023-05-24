package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class ConvertMetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double metres =Double.parseDouble(scanner.nextLine());
        double km= metres /1000;

        System.out.printf("%.2f",km);


    }
}
