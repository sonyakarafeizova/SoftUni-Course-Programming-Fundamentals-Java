package Method_Lab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        int num=Integer.parseInt(scanner.nextLine());
        System.out.println(reapeatString(input,num));
    }
    public static String reapeatString(String text,int count){
        String result="";
        for (int i = 0; i <count ; i++) {
            result=result+text;
        }
        return result;
    }
}
