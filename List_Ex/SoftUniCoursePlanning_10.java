package List_Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> topics = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .collect(Collectors.toList());


        String command = scanner.nextLine();
        while (!command.equals("course start")) {
            String[] commandsParts = command.split(":");
            String commandName = commandsParts[0];//add, insert,remove,swap,exersice
            String topic = commandsParts[1];

            switch (commandName) {
                case "Add":
                    if (!topics.contains(topic)) {
                        topics.add(topic);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandsParts[2]);
                    if (!topics.contains(topic)) {
                        topics.add(index, topic);
                    }
                    break;

                case "Remove":

                    if (topics.contains(topic)) {
                        int indexTopic = topics.indexOf(topic);//mqstoto na teamata
                        String exercise=topic + "-Exercise";
                        boolean hasExercise = indexTopic!=topics.size()-1&&topics.get(indexTopic + 1).equals(exercise);
                        topics.remove(topic);

                        if (hasExercise) {
                            topics.remove(exercise);
                        }
                    }
                    break;
                case "Swap":
                    String topic2 = commandsParts[2];

                    if (topics.contains(topic) && topics.contains(topic2)) {

                        int indexFirst = topics.indexOf(topic);//namirame indeksa na purvata tema
                        int indexSecond = topics.indexOf(topic2);

                        topics.set(indexFirst, topic2);
                        topics.set(indexSecond, topic);

                        //razmqna i na upr
                        String exFirst = topic + "-Exercise";
                        String exSecond = topic2 + "-Exercise";

                        if (topics.contains(exFirst)) {
                            topics.remove(exFirst);
                            topics.add(topics.indexOf(topic) + 1, exFirst);
                        }
                        if (topics.contains(exSecond)) {
                            topics.remove(exSecond);
                            topics.add(topics.indexOf(topic2) + 1, exSecond);
                        }
                    }
                    break;
                case "Exercise":

                    String exerciseName = topic + "-Exercise";
                    //proverka dali temata,za koqto dobavqme sushtestvuva
                    if (topics.contains(topic)) {
                        int indexTopic1 = topics.indexOf(topic);
                        if (indexTopic1 == topics.size() - 1) {
                            //moqta tema e posledna
                            topics.add(indexTopic1 + 1, exerciseName);
                        } else if (!topics.get(indexTopic1 + 1).equals(exerciseName)) {
                            topics.add(indexTopic1 + 1, exerciseName);
                        }
                    } else {
                        //nqmame takava tema->dobavqme temata v kraq na spisuka i dobavqme upr
                        topics.add(topic);//dobavqme tema
                        topics.add(exerciseName);

                    }

                    break;
            }


            command = scanner.nextLine();
        }
        int count = 1;
        for (String topic : topics) {
            System.out.println(count + "." + topic);
            count++;
        }

    }
}
