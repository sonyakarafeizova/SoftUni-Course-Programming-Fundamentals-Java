package DataTypesAndVariables_Ex;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());//N-tekushta sila
        int startPower = power;//nachalna
        int distance = Integer.parseInt(scanner.nextLine());//razstoqnie m/u celite (M)
        int factor = Integer.parseInt(scanner.nextLine());//factor iztoshtenie Y

        //povtarqme:
        //1.power-distance=>stigame do celta
        //2.namushkva celta
        //stop: power<distance
        //produljava"power>=distance
        int count = 0;//broi namushkani celi
        while (power >= distance) {
            //otiva do celta-namalqvame silata
            power -= distance;
            count++;
            //proverka umore
            if(power==startPower/2){
                //tekushtata sila/factor
                if(factor!=0){
                    power=power/factor;
                }
            }
        }
        System.out.println(power);
        System.out.println(count);

    }
}
