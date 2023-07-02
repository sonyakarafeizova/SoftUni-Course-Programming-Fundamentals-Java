package AssociativeArrays_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().replaceAll(" ", "");
        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        for (char symbol : input.toCharArray()) {
            //proverka za interval
            //if(symbol==' '){
            // continue;
            //}

            //proverka dali sme go sreshtali
            if (symbolsCount.containsKey(symbol)) {
                int currentCOutn = symbolsCount.get(symbol);
                symbolsCount.put(symbol, currentCOutn + 1);
            }
//proverka dali ne sme go
            else {
                symbolsCount.put(symbol, 1);
            }

        }
        symbolsCount.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
