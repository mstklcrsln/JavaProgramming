package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int [] arr= {1,1,1,1,1,2,2,3,4,4,4,4,5,6,6,6,6,6};
       arr= removeDuplicates(arr);
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5, 6]

        System.out.println("--------------");

        String [] arr2= {"Java", "Python","Python","Python","Python","Python", "C++","C++","C++", "Ruby", "C","C","C" };
        arr2= removeDuplicates(arr2);
        System.out.println(Arrays.toString(arr2)); //[Java, Python, C++, Ruby, C]

    }
    // removes the duplicated integers from the given array and returns new array
    public static int [] removeDuplicates (int [] array) {
            int [] result = {};

            for (int each : array) {
                if (!ArraysUtility.contains(result,each)) {
                    result= ArraysUtility.addElement(result,each);
                }
            }
            return result;
        }

    // removes the duplicated decimals from the given array and returns new array
    public static double [] removeDuplicates (double [] array) {
        double [] result = {};

        for (double each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // removes the duplicated chars from the given array and returns new array
    public static char [] removeDuplicates (char [] array) {
        char [] result = {};

        for (char each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // removes the duplicated Strings from the given array and returns new array
    public static String [] removeDuplicates (String [] array) {
        String [] result = {};

        for (String each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

}
