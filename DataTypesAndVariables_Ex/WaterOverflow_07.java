package DataTypesAndVariables_Ex;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int tankCapacity = 255;
        int currentLiters = 0;

        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(scanner.nextLine()); // Read liters to pour

            if (currentLiters + liters > tankCapacity) {
                System.out.println("Insufficient capacity!");
            } else {
                currentLiters += liters;
            }
        }

        System.out.println(currentLiters);
    }
}
