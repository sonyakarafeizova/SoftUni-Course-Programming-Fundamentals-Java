package Method_Ex;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text= scanner.nextLine();
        getMiddleCharacter(text);
    }

    private static void getMiddleCharacter(String input) {
        int length=input.length();
        int middleCharacter=length/2;

        if(length%2==0){
            char middleCharLeft=input.charAt(middleCharacter-1);
            char middleCharRight=input.charAt(middleCharacter);
            System.out.printf("%c%c",middleCharLeft,middleCharRight);
        }else{
            char middleChar=input.charAt(middleCharacter);
            System.out.println(middleChar);
        }
    }
}
