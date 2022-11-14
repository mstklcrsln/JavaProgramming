package day29_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(2,5,4,8,3,6,1,4,9,55,7,8,22,55));
        // sort method
        Collections.sort(list);
        System.out.println(list); //[1, 2, 3, 4, 4, 5, 6, 7, 8, 8, 9, 22, 55, 55]

        System.out.println("----------------");
        // reverse method
        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));

        System.out.println(list2); //[A, B, C, D, E]
        Collections.reverse(list2);
        System.out.println("list2 = " + list2); //list2 = [E, D, C, B, A]

        System.out.println("----------------");

        // swap method : it allows to swap the elements of two indexes

        ArrayList <Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60));
        //to change second element with the fifth element

        Collections.swap(list3,2,4);
        System.out.println(list3); //[10, 20, 50, 40, 30, 60] we changed 2 and 4th element by using indexes

        System.out.println("----------------");
        // max and min number
       int max=  Collections.max(list3);
        System.out.println(max);  //60

        int min= Collections.min(list3);
        System.out.println(min);//10

        System.out.println("----------------");
        // replaceAll method
        ArrayList <Integer> list4= new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,6,01,0,70,10,1,10));

        Collections.replaceAll(list4,10,999);
        System.out.println("list4 = " + list4);  //list4 = [999, 999, 20, 30, 40, 50, 6, 1, 0, 70, 999, 1, 999]

        System.out.println("----------------");
        //frequency method
        //to find the freq of 999 from list4
        int freq = Collections.frequency(list4,999);
        System.out.println(freq); //4

        System.out.println("----------------");
        //we want to find the frq of QA and SDET elements
        ArrayList<String> words= new ArrayList<>();
        words.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA" ));

        int freqQa= Collections.frequency(words,"QA");
        int freqSdet = Collections.frequency(words,"SDET");

        System.out.println("freqSdet = " + freqSdet);
        System.out.println("freqQa = " + freqQa);



    }
}
