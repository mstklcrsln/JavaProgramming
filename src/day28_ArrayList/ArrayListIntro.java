package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();// created integer arraylist
        ArrayList <String> names= new ArrayList<>(); // string arraylist

        System.out.println(numbers);  // array.toString method is in the code automatic, so we don't need to write
        System.out.println("names = " + names);

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        for (Integer each : list) {
            if (each%2 !=0){
                continue;
       }
            System.out.println(each+ " ");
            break;
        }


    }
}
