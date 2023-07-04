package OaC_OrderByAge_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Persons> listPeople=new ArrayList<>();
        String input=scanner.nextLine();

        while(!input.equals("End")){

            String name=input.split("\\s+")[0];
            String id=input.split("\\s+")[1];
            int age=Integer.parseInt(input.split("\\s+")[2]);

            Persons persons=new Persons(name,id,age);
            listPeople.add(persons);

            input=scanner.nextLine();

        }

        listPeople.sort(Comparator.comparing(Persons::getAge));

        for(Persons persons:listPeople){
            System.out.println(persons.getName() + " with ID: " + persons.getId() + " is " + persons.getAge() + " years old.");
        }
    }
}
