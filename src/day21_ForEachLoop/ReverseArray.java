package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

      int [] numbers = {10,20,30,4,50,60,7,80,90,100};
        // we want to reserve this array we need a new array

        int [] reversed = new int [numbers.length];
      //  System.out.println(Arrays.toString(reserved)); //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

       /*                   j                               i
         rerversed [0] =  numbers [numbers.length-1];
        rerversed [1] =  numbers [numbers.length-2];
        rerversed [2] =  numbers [numbers.length-3];*/



        for (int i = numbers.length - 1, j=0; i >= 0; i--, j++) {
            reversed [j] =numbers [i];
        }
        System.out.println(Arrays.toString(reversed)); //[100, 90, 80, 7, 60, 50, 4, 30, 20, 10]


            }
}
