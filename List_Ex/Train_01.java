package List_Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = new ArrayList<>();
        String[] wagonCapacities = scanner.nextLine().split(" ");
        for (String capacity : wagonCapacities) {
            wagons.add(Integer.parseInt(capacity));
        }

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.startsWith("Add")) {
                int passengers = Integer.parseInt(command.split(" ")[1]);
                wagons.add(passengers);
            } else {
                int passengers = Integer.parseInt(command);
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + passengers <= maxCapacity) {
                        wagons.set(i, wagons.get(i) + passengers);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < wagons.size(); i++) {
            System.out.print(wagons.get(i));
            if (i < wagons.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
