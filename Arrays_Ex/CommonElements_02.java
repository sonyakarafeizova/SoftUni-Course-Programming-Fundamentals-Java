package Arrays_Ex;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//vhod
        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");
//obhojdane na masivi-vseki element ot vtoriq masiv
        for (String elementSecondArray : secondArray) {
            //bloka ot kod,koito iskame da povtorim za vseki eidn element
            for (String elementFirstArray : firstArray) {
                if (elementSecondArray.equals(elementFirstArray)) {
                    System.out.print(elementFirstArray + " ");
                    break;
                }
            }
        }
    }
}
