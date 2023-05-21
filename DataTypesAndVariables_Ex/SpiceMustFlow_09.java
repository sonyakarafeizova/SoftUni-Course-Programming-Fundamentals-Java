package DataTypesAndVariables_Ex;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int starringYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int spice = 0;
        int realSpice = 0;
        while (starringYield >= 100) {
            spice = starringYield;
            days += 1;
            spice -= 26;
            realSpice += spice;
            starringYield -= 10;
        }
        if (realSpice >= 26) {
            realSpice -= 26;
        }
        System.out.println(days);
        System.out.println(realSpice);
    }
}
