package Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class th_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


                String[] loot = scanner.nextLine().split("\\|");
                String[] treasureChest = Arrays.copyOf(loot, loot.length);

                String command = scanner.nextLine();

                while (!command.equals("Yohoho!")) {
                    String[] commandArgs = command.split(" ");
                    String action = commandArgs[0];

                    switch (action) {
                        case "Loot":
                            for (int i = 1; i < commandArgs.length; i++) {
                                String item = commandArgs[i];
                                if (!containsItem(treasureChest, item)) {
                                    treasureChest = addItemToBeginning(treasureChest, item);
                                }
                            }
                            break;
                        case "Drop":
                            int index = Integer.parseInt(commandArgs[1]);
                            if (isValidIndex(treasureChest, index)) {
                                treasureChest = removeItemAtIndex(treasureChest, index);
                            }
                            break;
                        case "Steal":
                            int count = Integer.parseInt(commandArgs[1]);
                            String[] stolenItems = stealItems(treasureChest, count);
                            System.out.println(String.join(", ", stolenItems));
                            break;
                    }

                    command = scanner.nextLine();
                }

                if (treasureChest.length == 0) {
                    System.out.println("Failed treasure hunt.");
                } else {
                    int totalLength = 0;
                    for (String item : treasureChest) {
                        totalLength += item.length();
                    }
                    double averageGain = (double) totalLength / treasureChest.length;
                    System.out.printf("Average treasure gain: %.2f pirate credits.%n", averageGain);
                }
            }

            private static boolean containsItem(String[] array, String item) {
                for (String element : array) {
                    if (element.equals(item)) {
                        return true;
                    }
                }
                return false;
            }

            private static String[] addItemToBeginning(String[] array, String item) {
                String[] newArray = new String[array.length + 1];
                newArray[0] = item;
                System.arraycopy(array, 0, newArray, 1, array.length);
                return newArray;
            }

            private static boolean isValidIndex(String[] array, int index) {
                return index >= 0 && index < array.length;
            }

            private static String[] removeItemAtIndex(String[] array, int index) {
                String[] newArray = new String[array.length - 1];
                int newArrayIndex = 0;
                for (int i = 0; i < array.length; i++) {
                    if (i != index) {
                        newArray[newArrayIndex] = array[i];
                        newArrayIndex++;
                    }
                }
                return newArray;
            }

            private static String[] stealItems(String[] array, int count) {
                int stolenCount = Math.min(count, array.length);
                String[] stolenItems = new String[stolenCount];
                for (int i = array.length - stolenCount, j = 0; i < array.length; i++, j++) {
                    stolenItems[j] = array[i];
                }
                array = removeItems(array, array.length - stolenCount, array.length);
                return stolenItems;
            }

            private static String[] removeItems(String[] array, int startIndex, int endIndex) {
                int removedCount = endIndex - startIndex;
                String[] newArray = new String[array.length - removedCount];
                System.arraycopy(array, 0, newArray, 0, startIndex);
                System.arraycopy(array, endIndex, newArray, startIndex, newArray.length - startIndex);
                return newArray;
            }
        }
