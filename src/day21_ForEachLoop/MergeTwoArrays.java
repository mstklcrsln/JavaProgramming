package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {


        String[] group1= { "Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinema"       };
        String [] group2 = {" derin ", " gunay ", " Deniz", " initial ", "zuhal loop ", "ahmet ", " Maria", " Sinem"};

        String [] students= new String[group1.length+group2.length];

        // System.out.println(Arrays.toString(students));   [null, null, null, null, null, null, null, null, null, null, null, null, null, null]

        int i= 0;
        for (String each : group1) {
         students [i++] = each;
        }
        for (String each : group2) {
            students [i++] = each;
        }
        System.out.println(Arrays.toString(students)); //[Gunay, Anna, Zuhal, Ahmet, Maria, Sinema,  derin ,  gunay ,  Deniz,  initial , zuhal loop , ahmet ,  Maria,  Sinem]


        System.out.println("-------------------------------------");

        // to merge the chars

        char [] ch1= {'A','B','C'};
        char [] ch2= {'D','E','F','G'};

        char [] chars = new char [ch1.length+ch2.length];

        int j= 0; // index numbers of array


        for (char ch : ch1) {
                chars [j]= ch;
                j++;
        }
        for (char c : ch2) {
            chars [j]= c;
            j++;
        }
        System.out.println(Arrays.toString(chars));  //[A, B, C, D, E, F, G]


    }
}
