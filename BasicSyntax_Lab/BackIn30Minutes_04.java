package BasicSyntax_Lab;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours=Integer.parseInt(scanner.nextLine());
        int min=Integer.parseInt(scanner.nextLine());

        int minTotal=min+30;
        int total=hours*60+minTotal;

        int hoursAll=total/60;
        int minAll=total%60;

if (hoursAll>=24){
    hoursAll=0;
}
if(minAll<=9){
    System.out.printf("%d:0%d",hoursAll,minAll);
}else {
    System.out.printf("%d:%d",hoursAll,minAll);


}


    }
}