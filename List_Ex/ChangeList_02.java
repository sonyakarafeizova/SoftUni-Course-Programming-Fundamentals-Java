package List_Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("Delete")) {//ako sudurja delete
                int numberForRemove = Integer.parseInt(command.split(" ")[1]);
                //premahvame vsichki stoinosti ot spisuka,koito sa ravni na numbersforRemove

                numbers.removeAll(Arrays.asList(numberForRemove));
            } else if (command.contains("Insert")) {
                //vmukvame elementa i index-a
                int element = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                numbers.add(index,element);
            }

            command = scanner.nextLine();
        }
//spisuk s chisla

        for (int number:numbers) {
            System.out.print(number+" ");
        }

    }
}
