package day26_CustomMethodPractice;

import java.util.Arrays;

public class RemoveElements1 {
    public static void main(String[] args) {

        int [] numbers= {100,200,300,400,500,600};

        numbers=removeElement(numbers,1); //200 will be skipped
        System.out.println(Arrays.toString(numbers)); //[100, 300, 400, 500, 600]
        // if we assign again and again it will remove the element at the index 1
        System.out.println("-----------");
        numbers=removeElement(numbers,1); //200 will be skipped
        System.out.println(Arrays.toString(numbers)); //[100, 400, 500, 600]

        System.out.println("-----------");
        numbers=removeElement(numbers,1); //200 will be skipped
        System.out.println(Arrays.toString(numbers)); //[100, 500, 600]

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
        /*
        if there is two elements to remove in the array for each loop does not access to the indexes, so we must use for loop 
        for (int each : array) {        // ignoring the element of matching.
            if (each == array[index]) {    // if the condition is true i'll ignore/skip that element with continue
                continue;  //skip
            }
            result[j++] = each;// new array contains the all elements except the element which is at the given index
        }
        return result;
    }*/


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

/*
2. Create a class named RemoveElements:
			2.1 Create a method that passes two parametetrs: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}

			2.2 Create a method that passes two parametetrs: a double array and an integer index. the method removes the element at the given index of the array and returns the new array

			2.3 Create a method that passes two parametetrs: a char array and an integer index. the method removes the element at the given index of the array and returns the new array

			2.4 Create a method that passes two parametetrs: a String array and an integer index. the method removes the element at the given index of the array and returns the new array

 */