package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list1= new ArrayList<>();
        list1.addAll(Arrays.asList(1,1,2,3,4,4,3,5,5,6,6,7,8,9,9,8,1));
        // i'll find the uniq elements and add them the below list


        ArrayList <Integer> unique = new ArrayList<>();
        for (Integer each : list1) {
            int frequency= Collections.frequency(list1,each);
            if (frequency==1){
                unique.add(each);
            }
        }
        System.out.println(unique); //[2, 7]
    }
}
