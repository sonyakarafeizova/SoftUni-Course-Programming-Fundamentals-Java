package AssociativeArrays_Ex;

import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //otbor->spisuk

        Map<String, List<String>> teams = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {

            if (input.contains(" | ")) {
                String team = input.split(" \\| ")[0];
                String player = input.split(" \\| ")[1];

                //proverka za otbora
                //nqmame takuv otbor
                if (!teams.containsKey(team)) {
                    teams.put(team, new ArrayList<>());
                }
                //imame takuv otbor
                //dobavqme igracha v tozi otbor,ako go nqma v drug otbor
                boolean isExist = false;//pokazva dali igracha go ima v drug otbor
                //isExist=true->igracha go ima v drug otbor
                for (List<String> list : teams.values()) {
                    if (list.contains(player)) {
                        isExist = true;
                    }
                }
                if (!isExist) {
                    teams.get(team).add(player);
                }


            } else if (input.contains(" -> ")) {
                String player = input.split(" -> ")[0];//igrach,koito se mesti
                String team = input.split(" -> ")[1];//otbor,v koito se mesti
                //1.premahvame igrach,ako go ima v nqkoi otbor

                teams.entrySet().forEach(entryTeam -> entryTeam.getValue().remove(player));
//2.premestavene v noviq otbor
                //2.1ima li takuv otbor-mq,a
                if (!teams.containsKey(team)) {
                    teams.put(team, new ArrayList<>());
                    teams.get(team).add(player);
                }
                //2.2 ima li takuv otbor-ima
                else {
                    teams.get(team).add(player);
                }
                System.out.printf("%s joins the %s side!%n", player, team);
            }

            input = scanner.nextLine();
        }
        //print
        //premahvame otborite bez igrachi
        teams.entrySet().stream().filter(teamEntry -> teamEntry.getValue().size() > 0)//ostavqme igrachite,koito otgovarqt na uslovieto
                .forEach(entry->{
                    System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());
                    entry.getValue().forEach(player-> System.out.println("! "+player));
                });
    }
}
