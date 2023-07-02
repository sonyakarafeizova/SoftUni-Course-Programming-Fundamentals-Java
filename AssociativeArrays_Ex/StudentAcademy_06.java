package AssociativeArrays_Ex;

import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //student->spisuk ot ocenki
        Map<String, List<Double>> studentGrades=new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {
            String studentName= scanner.nextLine();
            double grade=Double.parseDouble(scanner.nextLine());
            //1.imam takuv student
            if(studentGrades.containsKey(studentName)){
                List<Double> currentGrades=studentGrades.get(studentName);
                currentGrades.add(grade);
            }
            //2.nqmame
            else{
                studentGrades.put(studentName,new ArrayList<>());
                studentGrades.get(studentName).add(grade);
            }

        }

        Map<String,Double> studentAverageGrade=new LinkedHashMap<>();
        //studenti sus sredna ocenka nad 4.5

        for(Map.Entry<String,List<Double>>entry : studentGrades.entrySet()){
            //entry: key(ime na studenta)->value (spisuk s ocenki)
            String studentName=entry.getKey();
            List<Double> grades=entry.getValue();
            double averageGrade=getAverageGrade(grades);
            if(averageGrade>=4.50){
                studentAverageGrade.put(studentName,averageGrade);
            }
        }
        studentAverageGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));

    }

    private static double getAverageGrade(List<Double>grades) {
        double sum=0;
        for(double grade:grades){
            sum+=grade;
        }
        return sum/ grades.size();
    }
}
