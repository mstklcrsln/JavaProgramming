package day26_CustomMethodPractice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,66};
        int [] result= reverse(arr);
        System.out.println(Arrays.toString(result)); //[66, 5, 4, 3, 2, 1]
    }
        // reverse the int array returns a new array
    public static int [] reverse (int [] array){
        int [] result = new int [array.length];
        // we can declare j outside the loop. j=0;
        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
           // array[i]=  array [i] represents the index number of arrays, we get each element from array
            // this new array needs to be started from new array's index 0,
            //j is the index number of new integer array
           result[j]= array[i];
        }
        return result;
    }
    // reverse the double array returns a new array
    public static double [] reverse (double [] array){
        double [] result = new double[array.length];
        // we can declare j outside the loop. j=0;
        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            // array[i]=  array [i] represents the index number of arrays, we get each element from array
            // this new array needs to be started from new array's index 0,
            //j is the index number of new integer array
            result[j]= array[i];
        }
        return result;
    }

    // reverse the char array returns a new array
    public static char[] reverse (char [] array){
        char [] result = new char[array.length];
        // we can declare j outside the loop. j=0;
        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            // array[i]=  array [i] represents the index number of arrays, we get each element from array
            // this new array needs to be started from new array's index 0,
            //j is the index number of new integer array
            result[j]= array[i];
        }
        return result;
    }

    // reverse the String array returns a new array
    public static String [] reverse (String [] array){
        String [] result = new String[array.length];
        // we can declare j outside the loop. j=0;
        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            // array[i]=  array [i] represents the index number of arrays, we get each element from array
            // this new array needs to be started from new array's index 0,
            //j is the index number of new integer array
            result[j]= array[i];
        }
        return result;
    }
}
