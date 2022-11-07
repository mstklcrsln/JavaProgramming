package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // method prints each integer of an integer array in seperate lines
    public static void printEachElement (int [] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }
    // it prints ech decimal number from double array in seperate lines
    public static void printEachElement (double [] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }
    // it prints each char of char array from array in seperate lines
    public static void printEachElement (char [] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }
    // it prints each String of string array from array in seperate lines
    public static void printEachElement (String [] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }


    // find the max number from integer array
    public static int max (int [] numbers) {
        Arrays.sort(numbers); // the last one is maximum number
        return numbers [numbers.length-1];
    }

    // find the max number from double array
    public static double max (double [] numbers) {
        Arrays.sort(numbers); // the last one is maximum number
        return numbers [numbers.length-1];
    }

    // find the min number from integer array
    public static int min (int [] numbers) {
        Arrays.sort(numbers); // the last one is maximum number
        return numbers [0];}

    // find the min decimal from double array
    public static double min (double [] numbers) {
        Arrays.sort(numbers); // the last one is maximum number
        return numbers [0];}

    // checks if the given integer is contained in the given array, returns boolean.

    public static boolean contains(int [] array, int element){
        boolean result= false;

        for (int each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }

    // checks if the given double is contained in the given array, returns boolean.
    public static boolean contains(double [] array, double element){
        boolean result= false;

        for (double each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }
    // checks if the given char is contained in the given array, returns boolean.
    public static boolean contains(char [] array, char element){
        boolean result= false;

        for (char each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }

    // checks if the given String is contained in the given array, returns boolean.
    public static boolean contains(String [] array, String element){
        boolean result= false;

        for (String each : array) {
            if (each.equals(element))
                result=true;

        }
        return result;
    }
}
