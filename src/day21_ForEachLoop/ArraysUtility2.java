package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

       String [] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel" };
        String [] earlyBirds = Arrays.copyOf(students,3);  // we get from 1 to 3 element

        System.out.println(Arrays.toString(earlyBirds));  //[Elif, Sinem, Gunay]

        System.out.println("--------------------------------------");

        int []num= {1,2,3,4,5,6,7,8,9,10};
        num= Arrays.copyOf(num,5);
        System.out.println(Arrays.toString(num));  //[1, 2, 3, 4, 5]

        System.out.println("--------------------------------------");

        char [] ch1= {'A','B','C','D','E','F','G','H','I'};
        char [] ch2 =Arrays.copyOfRange(ch1,2,6); // from 2 to 6  and 6 is not write
        System.out.println(Arrays.toString(ch2)); //[C, D, E, F]

        System.out.println("--------------------------------------");

        int [] scores = {10,20,30,40,50,60,70,80,90,100}; // we will get 4 to 8
        // index             0   1    2   3   4   5   6  7   8     9
        int [] result = Arrays.copyOfRange(scores,3,8);

        System.out.println(Arrays.toString(result)); //[40, 50, 60, 70, 80]


    }
}
