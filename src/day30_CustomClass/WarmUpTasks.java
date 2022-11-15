package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {

        // write a program that can swap first and last elements of an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Collections.swap(list,0, list.size()-1);
        System.out.println(list); //[9, 2, 3, 4, 5, 6, 7, 8, 1]


        // Write a programme that can move all the zeros to the last indexes of the ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,0,2,0,3,0,4,0,5,5,6,0,7,8));
       // System.out.println(list1);    [1, 0, 2, 0, 3, 0, 4, 0, 5, 5, 6, 0, 7, 8]
        //first how many zeros we have in this ArrayList
        int size= list1.size();
        // we find the length of the list and
        //              remove all zeros from arraylist,
        //                 subtract new length from list1's length so we find how many zeros in the array
        list1.removeAll(Arrays.asList(0)); // we remove all the zeros
        System.out.println(list1); //[1, 2, 3, 4, 5, 5, 6, 7, 8] we removed all zeros

        // to find how many zero has removed
        int newSize= list1.size(); //this is the new size

        int totalNumberOfZeros = size-newSize;
        System.out.println(totalNumberOfZeros); //we have 5 zeros

        //after this stage we add 5 zeros to the list again
        for (int i = 0; i < totalNumberOfZeros; i++) { // we iterate by using loop totalNumberOfZeros times
        list1.add(0);
        }
        System.out.println("list1 = " + list1); //list1 = [1, 2, 3, 4, 5, 5, 6, 7, 8, 0, 0, 0, 0, 0]


        // Write a programme that can exract the special characters, digits and letters from a string

    }
}
