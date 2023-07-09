package TextProcessing_Ex;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] codes = input.split("\\s+");
        double totalSum = 0;//suma ot modific chisla
        for (String code : codes) {

            double modifiedNum = getModifiedNumber(code);
            totalSum += modifiedNum;
        }

        System.out.printf("%.2f", totalSum);
    }

    public static double getModifiedNumber(String code) {
        char beforeLetter = code.charAt(0);
        char afterLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(beforeLetter, ' ')
                .replace(afterLetter, ' ')
                .trim());
        if (Character.isUpperCase(beforeLetter)) {
            int positionUpperLetter =(int)beforeLetter-64;

            number/=positionUpperLetter;
        }else{
            int positionLowerLetter=(int)beforeLetter-96;
                    number*=positionLowerLetter;
        }
        if(Character.isUpperCase(afterLetter)){
            int positionUpperLetter =(int)afterLetter-64;

            number-=positionUpperLetter;
        }else{
            int positionLowerLetter=(int)afterLetter-96;
            number+=positionLowerLetter;
        }
        return number;
    }
}
