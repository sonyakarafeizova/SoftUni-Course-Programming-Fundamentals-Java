package OaC_Students_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students>studentList=new ArrayList();
         int count=Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=count ; i++) {
            String data = scanner.nextLine();

            String firstName = data.split("\\s+")[0];
            String lastName = data.split("\\s+")[1];
            double grade = Double.parseDouble(data.split("\\s+")[2]);

            Students student = new Students(firstName, lastName, grade);
            studentList.add(student);

        }
        studentList.sort(Comparator.comparing(Students::getGrade).reversed());

        for(Students student:studentList){


            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }



    }
}
