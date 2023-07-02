package AssociativeArrays_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //shards->kolichestvo
        //fragments->kolichestvo
        //moes-kolichestvo

        Map<String, Integer> materials = new LinkedHashMap<>();//materiali,koito sa nujni
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        Map<String, Integer> junks = new LinkedHashMap<>();//materiali,koito sa bokluci
        boolean isWin = false;//ne sme spechelili i igrata produljava

        while (!isWin) {
            String input = scanner.nextLine();
            String[]inputData=input.split("\\s+");

            for (int index = 0; index <= inputData.length-1 ; index+=2) {
                int quantity=Integer.parseInt(inputData[index]);
                String material=inputData[index+1].toLowerCase();

                //proverka na material
                if(material.equals("shards")||material.equals("fragments")||material.equals("motes")){
                    int currentQuantuty=materials.get(material);
                    materials.put(material,currentQuantuty+quantity);
                }else{
                    //bokluk
                    if(junks.containsKey(material)){
                        int currentQuantity=junks.get(material);
                        junks.put(material,currentQuantity+quantity);
                    }else{
                        junks.put(material,quantity);
                    }
                }
                //proverka dali sme spechelili legendaren predmet
                if(materials.get("shards")>=250){
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards")-250);
                    isWin=true;
                    break;
                }else if(materials.get("fragments")>=250){
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments")-250);
                    isWin=true;
                    break;
                }else if(materials.get("motes")>=250){
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes")-250);
                    isWin=true;
                    break;
                }
            }
            if(isWin){
                break;
            }
        }
//vsichki validni materiali
        materials.entrySet().forEach(entry-> System.out.println(entry.getKey()+": "+entry.getValue()));
        //bkluci

        junks.entrySet().forEach(entry-> System.out.println(entry.getKey()+": "+entry.getValue()));
    }
}
