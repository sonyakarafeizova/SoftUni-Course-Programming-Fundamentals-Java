package Method_Lab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        price(product,quantity);

    }

    public static void price(String product, int quantity) {
        double price = 0;
        if (product.equals("coffee")){
            price = 1.50 * quantity;
            System.out.printf("%.2f",price);
        }else if(product.equals("water")){
            price=1.0*quantity;
            System.out.printf("%.2f",price);
        }else if(product.equals("coke")){
            price=1.40*quantity;
            System.out.printf("%.2f",price);
        }else if(product.equals("snacks")){
            price=2.0*quantity;
            System.out.printf("%.2f",price);
        }
    }
}
