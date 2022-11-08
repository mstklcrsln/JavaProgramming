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

    //	1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element; //element need to be assigned to the last index
        return result;
    } // function to add one element to array

    // 2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] array, double element) {

        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;

        } result[i] = element;//element need to be assigned to the last index
        return result;
    }

    // 3. create a return method called addString that can add a String after the last index of a String array
    public static String [] addElement (String [] array,String element){
        String [] result= new String[array.length+1];
        int i =0;
        for (String each : array) {
            result[i++]=each;
        }
        result[i]=element;//element need to be assigned to the last index
        return result;

    }

    // 4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement (char[] array, char element){
        char [] result = new char[array.length+1];
        int i=0;
        for (char each : array) {
            result[i++]= each;
        }
        // result[result.length-1]= element; we can write like this
        result[i]= element; //i is the last index of array
        return result;
    }

    //gives the frequency of an element in an array
    public static int frequencyOfElement (int [] array, int element){
        int count=0;
        for (int each : array) { // each represents ech elements of the arrar
            if (each==element){
                count++;
            }
        }
        return count;
    }


    //gives the frequency of a double from the given array
    public static int frequencyOfElement (double [] array, double element){
        int count=0;
        for (double each : array) { // each represents ech elements of the arrar
            if (each==element){
                count++;
            }
        }
        return count;
    }

    //gives the frequency of a char from the given array
    public static int frequencyOfElement (char [] array, char element){
        int count=0;
        for (char each : array) { // each represents ech elements of the arrar
            if (each==element){
                count++;
            }
        }
        return count;
    }

    //gives the frequency of a string from the given array
    public static int frequencyOfElement (String [] array, String element){
        int count=0;
        for (String each : array) { // each represents ech elements of the arrar
            if (each.equals(element)){
                count++;
            }
        }
        return count;
    }

    // Returns the unique elements of the array as a new array
    public static int [] uniqueElements (int [] array){
        int [] result = {};  // new int [0]
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1) { // if the frequence is 1 that means the element is uniq.
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // Returns the unique doubles of the array as a new array
    public static double [] uniqueElements (double [] array){
        double [] result = {};  // new int [0]
        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1) { // if the frequence is 1 that means the element is uniq.
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // Returns the unique char of the array as a new array
    public static char [] uniqueElements (char [] array){
        char [] result = {};  // new int [0]
        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1) { // if the frequence is 1 that means the element is uniq.
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // Returns the unique String of the array as a new array
    public static String [] uniqueElements (String [] array){
        String [] result = {};  // new int [0]
        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1) { // if the frequence is 1 that means the element is uniq.
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // removes the index from array, returns new array
    public static int[] removeElement(int[] array, int index) {

        if (index<0|| index>array.length-1){  // if the given index is out of boundry
            System.err.println("Invalid index :" + index);
            System.exit(0);
        }

        int[] result = new int[array.length - 1];

        int j = 0; // in the for each loop we don't access to the index of int [] result, so we create j which will represent the indexes of array result when the loop executed for each time

        //from his line we write the code again with for loop
        for (int i = 0; i <array.length ; i++) {
            if (i == index) { // if the index of array is matching with the given index
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    // removes the decimals given index from array, returns new array
    public static double[] removeElement(double[] array, int index) {

        if (index<0|| index>array.length-1){  // if the given index is out of boundry
            System.err.println("Invalid index :" + index);
            System.exit(0);
        }
        double[] result = new double[array.length - 1];
        int j = 0;

        for (int i = 0; i <array.length ; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }


    // removes the char given index from array, returns new array
    public static char [] removeElement(char[] array, int index) {

        if (index<0|| index>array.length-1){  // if the given index is out of boundry
            System.err.println("Invalid index :" + index);
            System.exit(0);
        }
        char[] result = new char [array.length - 1];
        int j = 0;

        for (int i = 0; i <array.length ; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }


    // removes the String given index from array, returns new array
    public static String [] removeElement(String[] array, int index) {

        if (index<0|| index>array.length-1){  // if the given index is out of boundry
            System.err.println("Invalid index :" + index);
            System.exit(0);
        }
        String [] result = new String [array.length - 1];
        int j = 0;

        for (int i = 0; i <array.length ; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }
}



