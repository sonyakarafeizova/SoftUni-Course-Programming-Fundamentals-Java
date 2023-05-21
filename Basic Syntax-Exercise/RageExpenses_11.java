package BasicSyntax_Ex;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //tursim krainata suma=suma za shlushalki+mushka+klaviatura+display
        //suma slushalki=broi *cena slushalki

        //vhodni danni

        int countLoseGames=Integer.parseInt(scanner.nextLine());
        double priceHeadset=Double.parseDouble(scanner.nextLine());
        double priceMouse=Double.parseDouble(scanner.nextLine());
        double priceKeyboard=Double.parseDouble(scanner.nextLine());
        double priceDisplay=Double.parseDouble(scanner.nextLine());

        int countHeadset=countLoseGames/2;
        int countMouse=countLoseGames/3;
        int countKeyboard=countLoseGames/6;
        int countDisplay=countLoseGames/12;

       double totalPrice=priceHeadset*countHeadset+priceMouse*countMouse+priceKeyboard*countKeyboard+priceDisplay*countDisplay;

        System.out.printf("Rage expenses: %.2f lv.",totalPrice);

    }
}
