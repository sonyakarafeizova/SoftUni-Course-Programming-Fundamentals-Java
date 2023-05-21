package DataTypesAndVariables_Ex;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maxV = Double.MIN_VALUE;
        String maxModel = "";
        int countKegs = Integer.parseInt(scanner.nextLine());
        for (int keg = 1; keg <= countKegs; keg++) {
            String modelKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > maxV) {
                maxV = volume;
                maxModel = modelKeg;
            }
        }
        System.out.println(maxModel);
    }
}
