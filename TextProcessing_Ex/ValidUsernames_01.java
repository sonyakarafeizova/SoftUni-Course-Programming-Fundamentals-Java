package TextProcessing_Ex;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] usernames = input.split(", ");

        for(String username:usernames){

            if(isValidUsername(username)){
                System.out.println(username);
            }

        }


    }
    //metod, koito proverqva dali username e validen
     public static boolean isValidUsername(String username){
        //validna duljina
         if(username.length()<3||username.length()>16){
             //nevalidna
             return false;
         }
         //validno sudurjanie
         for(char symbol:username.toCharArray()){
             if(!Character.isLetterOrDigit(symbol)&& symbol!='-'&&symbol!='_'){
                 //nevaliden
                 return false;
             }
         }
        //validno sudurjanie
         return true;

     }
}
