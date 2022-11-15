package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        // we want to find uniq characters
        String str= "aaabccccccqggggzxljgryyyyyffffsdsssddeeeffg";
    /*   str.split("") split method splits the string and creates string array, then we put this code into the instructor and get arraylist which includes all elements of the string
        String arr [] = str.split(""); firstly we convert string to string Array
      */

        ArrayList<String> list = new ArrayList<>(Arrays.asList( str.split("")));

       // System.out.println(list); [a, a, a, b, c, c, c, d, e, e, e, f, f, g]
        System.out.println(list); //[a, a, a, b, c, c, c, c, c, c, q, g, g, g, g, g, r, y, y, y, y, y, f, f, f, f, s, d, s, s, s, d, d, e, e, e, f, f, g]

        /*
        we add ecah element into the arraylist.
        to find the uniq characters we will iterate each character from this loop one by one, than by using frquency method seperate them and if the freq is 1 so it means that character is uniq.
        So we need for each loop
         */

        String unique= "";
        for (String eachElementOfArrayList : list) {
            int frequency= Collections.frequency(list,eachElementOfArrayList);
            if (frequency==1){
                unique+= eachElementOfArrayList;
            }

        }
        System.out.println(unique); // bqzxljr the uniq characters of the string










    }
}
