package Array_Lab;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dayOfWeekArr = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"

        };
        int n = Integer.parseInt(scanner.next());
        if(n>=1&&n<=7){
            System.out.printf(dayOfWeekArr[n-1]);
        }else{
            System.out.println("Invalid day!");
        }
    }
}
