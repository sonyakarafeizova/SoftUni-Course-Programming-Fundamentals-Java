package BasicSyntax_Ex;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents=Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        int lightsabers=(int)Math.ceil(countOfStudents*1.1);
        int freeBelts =countOfStudents/6;

        double totalSum=countOfStudents*priceOfRobes+lightsabers*priceOfLightsabers+(countOfStudents- freeBelts)*priceOfBelts;



        if(totalSum<=amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.",totalSum);
        }else{
            double diff=Math.abs(totalSum-amountOfMoney);
            System.out.printf("George Lucas will need %.2flv more.",diff);
        }
    }
}
