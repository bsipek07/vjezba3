import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Unesi rečenicu:");
        String recenica = input.nextLine();

        int cntz = 0;
        int cntn = 0;
        int cnte = 0;
        int cntv = 0;
        int cntm = 0;

        char rijec ;
        for(int i =0; i< recenica.length();i++)
        {

            rijec=recenica.charAt(i);
            if(Character.isAlphabetic(rijec)){
                if(Character.isUpperCase(rijec))cntv++;
                    else cntm++;
                cntz++;
            }
            else if (Character.isDigit(rijec))cntn++;

                else cnte++;
        }

        System.out.println("Znakovi:"+cntz+"\nBrojevi:"+cntn+"\nOstalo:"+cnte +"\nVelika slova:"+cntv+"\nMala slova:"+cntm);





    }

}
