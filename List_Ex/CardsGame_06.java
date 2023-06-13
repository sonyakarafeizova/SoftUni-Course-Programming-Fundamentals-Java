package List_Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {
            int firstPlayerCard = firstPlayerCards.remove(0);
            int secondPlayerCard = secondPlayerCards.remove(0);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerCards.add(firstPlayerCard);
                firstPlayerCards.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayerCards.add(secondPlayerCard);
                secondPlayerCards.add(firstPlayerCard);
            }
        }

        if (firstPlayerCards.isEmpty()) {
            int sum = calculateSum(secondPlayerCards);
            System.out.println("Second player wins! Sum: " + sum);
        } else if (secondPlayerCards.isEmpty()) {
            int sum = calculateSum(firstPlayerCards);
            System.out.println("First player wins! Sum: " + sum);
        }
    }

    private static List<Integer> readCards(Scanner scanner) {
        List<Integer> cards = new ArrayList<>();
        String[] input = scanner.nextLine().split("\\s+");
        for (String card : input) {
            cards.add(Integer.parseInt(card));
        }
        return cards;
    }

    private static int calculateSum(List<Integer> deck) {
        int sum = 0;
        for (int card : deck) {
            sum += card;
        }
        return sum;
    }
}