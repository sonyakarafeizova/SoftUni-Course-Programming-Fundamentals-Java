package AssociativeArrays_Ex;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, ArrayList<String>> companies = new LinkedHashMap<>();
        while (!input.equals("End")) {

            String[] companyData = input.split(" ");
            String companyName = companyData[0];
            String number = companyData[2];

            if (!companies.containsKey(companyName)) {
                companies.put(companyName, new ArrayList<String>());
            }

            if (companies.containsKey(companyName) && !companies.get(companyName).contains(number)) {
                companies.get(companyName).add(number);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> entry : companies.entrySet()) {
            String companyName = entry.getKey();
            ArrayList<String> employees = entry.getValue();

            System.out.println(companyName);
            for (String employee : employees) {
                System.out.println("-- " + employee);
            }
        }
    }
}
