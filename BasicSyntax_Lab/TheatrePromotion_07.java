package BasicSyntax_Lab;

import java.util.Scanner;

public class TheatrePromotion_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double price = 0;
        boolean isValid=true;

        if (day.equals("Weekday")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                price = 12;
            } else if (age > 18 && age <= 64) {
                price = 18;
            }
        }else {
            isValid=false;
        }
        if (day.equals("Weekend")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                price = 15;
            } else if (age > 18 && age <= 64) {
                price = 20;
            }
        }else {
            isValid=false;
        }
        if (day.equals("Holiday")) {
            if ((age >= 0 && age <= 18) ) {
                price = 5;
            } else if(age>18&& age<64){
                price=12;
            }

            else if (age > 64 && age <= 122) {
                price = 10;
            }
        }else {
            isValid=false;
        }

        if (price>0) {
            isValid=true;
            System.out.printf("%.0f$",price);

        } else {

            System.out.println("Error!");
        }


    }


}
