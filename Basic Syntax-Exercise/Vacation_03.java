package BasicSyntax_Ex;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        switch (type) {
            case "Students":
                if (day.equals("Friday")) {
                    price = 8.45 * num;
                } else if (day.equals("Saturday")) {
                    price = 9.80 * num;
                } else if (day.equals("Sunday")) {
                    price = 10.46 * num;
                }
                if (num >= 30) {
                    price = 0.85 * price;
                }
                break;
            case "Business":
                if (day.equals("Friday")) {
                    price = 10.90 * num;
                    if (num >= 100) {
                        price = (num - 10)*10.90;
                    }
                } else if (day.equals("Saturday")) {
                    price = 15.60 * num;
                    if (num >= 100) {
                        price = (num - 10)*15.60;
                    }
                } else if (day.equals("Sunday")) {
                    price = 16 * num;
                    if (num >= 100) {
                        price = (num - 10)*16;
                    }
                }
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    price = 15 * num;
                } else if (day.equals("Saturday")) {
                    price = 20 * num;
                } else if (day.equals("Sunday")) {
                    price = 22.50 * num;
                }
                if (num >= 10 && num <= 20) {
                    price = 0.95 * price;
                }
                break;
        }

        System.out.printf("Total price: %.2f", price);


    }
}
