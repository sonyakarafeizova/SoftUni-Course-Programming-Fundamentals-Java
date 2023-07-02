package AssociativeArrays_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> resources = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            resources.put(resource, resources.getOrDefault(resource, 0) + quantity);
            input = scanner.nextLine();
        }
        resources.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
