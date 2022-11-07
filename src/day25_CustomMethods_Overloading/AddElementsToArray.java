package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        arr = addInteger(arr, 5);
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5]

        System.out.println("-------------------------");

        double[] arr2 = {1.5, 5.2, 3.2, 1.9};
        arr2 = addDouble(arr2, 6.5);
        System.out.println(Arrays.toString(arr2)); //[1.5, 5.2, 3.2, 1.9, 6.5]

        System.out.println("-------------------");
        String [] arr3 = {"java", "wooden", "spoon", "c", "c#"};
        arr3= addString(arr3,"mesut");
        System.out.println(Arrays.toString(arr3)); //[java, wooden, spoon, c, c#, mesut]

        System.out.println("-------------------");
        char [] arr4 = {'d','a','e','b','c'};
        arr4= addChar(arr4,'E');
        System.out.println(Arrays.toString(arr4)); //[d, a, e, b, c, E]
    }
    //	1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element; //element need to be assigned to the last index
        return result;
    } // function to add one element to array
    // 2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addDouble(double[] array, double element) {

        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;

        } result[i] = element;//element need to be assigned to the last index
        return result;
    }

    // 3. create a return method called addString that can add a String after the last index of a String array
    public static String [] addString (String [] array,String element){
        String [] result= new String[array.length+1];
        int i =0;
        for (String each : array) {
            result[i++]=each;
        }
        result[i]=element;//element need to be assigned to the last index
        return result;

    }

    // 4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addChar (char[] array, char element){
        char [] result = new char[array.length+1];
        int i=0;
        for (char each : array) {
            result[i++]= each;
        }
       // result[result.length-1]= element; we can write like this
        result[i]= element; //i is the last index of array
        return result;
    }

}
/*
Task2:
		1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of a char array

 */