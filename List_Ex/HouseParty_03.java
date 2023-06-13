package List_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsNum = Integer.parseInt(scanner.nextLine());
        List<String> guestList = new ArrayList<>();//spisuk s gosti,purvo e prazen
        for (int i = 0; i < commandsNum; i++) {
            String input = scanner.nextLine();

            String[] command = input.split(" ");//preobrazuvame v masiv

            boolean isInTheList = false;
            boolean isNotInTheList = false;

            if (!"not".equalsIgnoreCase(command[2])) {
                for (String name : guestList) {
                    if (name.equals(command[0])) {
                        isInTheList = true;
                        break;
                    }
                }
                if (isInTheList) {
                    System.out.printf("%s is already in the list!%n", command[0]);
                } else {
                    guestList.add(command[0]);
                }
            } else {
                if (!guestList.contains(command[0])) {
                    System.out.printf("%s is not in the list!%n", command[0]);
                } else {
                    guestList.remove(command[0]);
                }
            }
        }
//otpechatvame spisuka
        for (String name : guestList) {

            System.out.println(name);
        }
    }
}
