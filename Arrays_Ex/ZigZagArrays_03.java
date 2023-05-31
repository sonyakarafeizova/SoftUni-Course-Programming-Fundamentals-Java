package Arrays_Ex;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());//broi redove
        String[] firstArray = new String[rows];
        String[] secondArray = new String[rows];

        //cheten red->purvoto chislo e vav vtoriq masiv, a vtoroto v purviq
//necheten red->purvoto chislo e v purviq masiv,a vtoroto chislo e vav vtoriq masiv

        for (int row = 1; row <= rows; row++) {

            String[] numbers = scanner.nextLine().split(" ");//poluchavame masiv ot dvete chisla,koito imame
            String firstNum = numbers[0];
            String secondNum = numbers[1];

            if (row % 2 == 0) {
                //firstNum otiva vav vtori masiv, a vtoroto v purviq masiv
                secondArray[row - 1] = firstNum;
                firstArray[row - 1] = secondNum;

            } else {
                //purvoto chislo e v purviq masiv,a vtoroto chislo e vav vtoriq masiv
                firstArray[row - 1] = firstNum;
                secondArray[row - 1] = secondNum;
            }

        }
//otpechatvame masiv:
        //1.for po index
        //2.foreach po elementi
        //3.String.join!!!samo za masiv ot tekstove

        System.out.println(String.join(" ",firstArray));
        System.out.println(String.join(" ",secondArray));


    }
}
