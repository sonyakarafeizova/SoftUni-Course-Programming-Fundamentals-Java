package Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int peopleTotal=0;

        int[] trains =new int[n];
        for (int i = 0; i <n ; i++) {
            int people=Integer.parseInt(scanner.nextLine());
            trains[i]=people;
            peopleTotal+=people;

        }
        // za printirane
        for (int i = 0; i < n; i++) {
            System.out.print(trains[i] + " ");
        }
        System.out.println();
        System.out.println(peopleTotal);
        scanner.close();
    }
}
