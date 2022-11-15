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
        System.out.println("---------------------------");
        // second solution with using newArrayList

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0,5,5,6,0,7,8));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) { // this loop adds the elements that are NOT zero
            if(each !=0){
                result.add(each);
            }
        }
        // System.out.println("result = " + result); result = [1, 2, 3, 4, 5, 5, 6, 7, 8]
        for (Integer each : list2) {// this loop adds the elements that are  zero
            if (each==0){
                result.add(each);
            }
        }
        System.out.println("result = " + result);


        // Write a programme that can extract the special characters, digits and letters from a string

        String str= "AAAA1234'^^+^aaCC%+1HHBBBRRf5161fggfgf(&%++";

        ArrayList<Character> chars = new ArrayList<>();
        /*
        to get each element from string and convert to the ArrayList
        if we use split method it gives String
        if we use chatAt it gives char and we can not use them in the Arraylist
        we don't have any method that directly convert string to the Caharacter Arraylist
        so we must use for loop to get each character from the string
         */
        for (int i = 0; i <str.length() ; i++) {
            chars.add(str.charAt(i)); // now we get all characters from the string
        }
        ArrayList<Character> letters =new ArrayList<>(chars); // we will put the letters to this Arraylist

        // System.out.println(letters);         [A, A, A, A, 1, 2, 3, 4, ', ^, ^, +, ^, %, +, 1, 5, 1, 6, 1, f, g, g, f, g, f, (, &, %, +, +]

        // we must removeIf method because we don't know the elements which are removed
         //   letters.removeIf(p-> Character.isLetter(p)); // remove all which are  letter
       // System.out.println(letters); [1, 2, 3, 4, ', ^, ^, +, ^, %, +, 1, 5, 1, 6, 1, (, &, %, +, +]

        letters.removeIf(p-> !Character.isLetter(p)); // remove all which are not letter

         System.out.println(letters); //[A, A, A, A, a, a, C, C, H, H, B, B, B, R, R, f, f, g, g, f, g, f]

        ArrayList<Character> digits = new ArrayList<>(chars); // add all characters
        digits.removeIf(p-> !Character.isDigit(p)); // remove everything except digits
        System.out.println(digits); //[1, 2, 3, 4, 1, 5, 1, 6, 1]

        ArrayList<Character> specialChar = new ArrayList<>(chars);
        specialChar.removeAll(letters); // we removed all letters
        specialChar.removeAll(digits);  // we removed all digits
        System.out.println(specialChar); //[', ^, ^, +, ^, %, +, (, &, %, +, +]



    }
}
