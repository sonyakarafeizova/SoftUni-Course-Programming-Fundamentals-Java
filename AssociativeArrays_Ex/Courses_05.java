package AssociativeArrays_Ex;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Boolean>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" : ");
            String courseName = tokens[0];
            String studentName = tokens[1];

            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new LinkedHashMap<>());
            }

            courses.get(courseName).put(studentName, true);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Boolean>> entry : courses.entrySet()) {
            String courseName = entry.getKey();
            Map<String, Boolean> students = entry.getValue();

            System.out.println(courseName + ": " + students.size());
            for (String student : students.keySet()) {
                System.out.println("-- " + student);
            }
        }
    }
}