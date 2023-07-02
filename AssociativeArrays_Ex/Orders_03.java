package AssociativeArrays_Ex;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();

        Map<String, ArrayList<Double>> orders = new LinkedHashMap<>();
        while(!input.equals("buy")){
            String[]inputData=input.split("\\s+");
            String product=inputData[0];
            double price=Double.parseDouble(inputData[1]);
            double quantity=Double.parseDouble(inputData[2]);

            if(!orders.containsKey(product)){
                orders.put(product,new ArrayList<>());
                orders.get(product).add(price);
                orders.get(product).add(quantity);
            }else{
                orders.get(product).set(0,price);
                double newQuantity=orders.get(product).get(1)+quantity;
                orders.get(product).set(1,newQuantity);
            }


            input= scanner.nextLine();
        }
        orders.entrySet()
                .stream()
                .forEach(o -> System.out.println(String.format("%s -> %.2f",
                        o.getKey(), o.getValue().get(0) * o.getValue().get(1))));
    }
}
