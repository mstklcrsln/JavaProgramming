package day21_ForEachLoop;

public class ReversedName {
    public static void main(String[] args) {

        // we want to write every single name revesed order
        String [] words = {"Gunay Demir", "Anna Kesut", "Zuhal mete ", "Ahmet basak ", "Maria derin ", "Sinema gunay ", "gunay Deniz", "anna initial ", "zuhal loop ", "ahmet DEmiroz", "maria Maria", "sinem Sinem"};


        for (String each : words ) { // each represents every single name Gunay Demir", "Anna Kesut ", "Zuhal mete "....

            String reversed = "";

            for (int i = each.length()-1; i >=0 ; i--) { // westarted from last character
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
            }
        /*
        rimeD yanuG
tuseK annA
 etem lahuZ
 kasab temhA
 nired airaM
 yanug ameniS
zineD yanug
 laitini anna
 pool lahuz
zorimED temha
airaM airam
meniS menis
         */

        }
    }

