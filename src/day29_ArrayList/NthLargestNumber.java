package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int n= 3;
        for (int i = 1; i <n ; i++) {
            list.removeIf(p-> Collections.max(list)==p );
        }

        /*
        list.removeIf(p-> Collections.max(list)==p ); // we need to get all max numbers, once we get the first maximum number and than we get the second max number. To remove all the maximum numbers from this list we use removeIf method. ın order to get the second max, the first max will be removed. This code means If the number is first max number==>remove it

        list.removeIf(p-> Collections.max(list)==p );
        list.removeIf(p-> Collections.max(list)==p );

        System.out.println(max); // ==>8     after the code above it will be 7, after that 6... so we write the code again and again
        */

        int max= Collections.max(list);
        System.out.println(max); //6
    }
}
/*
write program that can return the nth largest number from the given arraylist

 */