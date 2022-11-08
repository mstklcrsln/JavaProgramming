package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        arr= replace(arr,2,30);
        System.out.println(Arrays.toString(arr)); //[1, 2, 30, 4, 5]

        System.out.println("------------------");
        String [] arr2= {"Java", "Python", "C++", "Ruby", "C" };
        arr2= replace(arr2,2,"c#");
        System.out.println(Arrays.toString(arr2)); //[Java, Python, c#, Ruby, C]
    }





    // replaces/ changes the element in the given array returns new array
    public static int [] replace (int [] array, int index, int newElement){
            if (index<0 || index>array.length-1){
            System.err.println("ınvalid index :" + index);
            System.exit(0);}
            array[index]= newElement;
            return array;
        }

    // replaces/ changes the doubles  in the given array returns new array
    public static double [] replace (double [] array, int index, double newElement){
        if (index<0 || index>array.length-1){
            System.err.println("ınvalid index :" + index);
            System.exit(0);}
        array[index]= newElement;
        return array;
    }

    // replaces/ changes the chars in the given array returns new array
    public static char [] replace (char [] array, int index, char newElement){
        if (index<0 || index>array.length-1){
            System.err.println("ınvalid index :" + index);
            System.exit(0);}
        array[index]= newElement;
        return array;
    }

    // replaces/ changes the chars in the given array returns new array
    public static String [] replace (String [] array, int index, String newElement){
        if (index<0 || index>array.length-1){
            System.err.println("ınvalid index :" + index);
            System.exit(0);}
        array[index]= newElement;
        return array;
    }

}

/*
1. Replace Task:
		1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
				Ex:
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}

		1.2 Create the same functions for double arrays, char arrays, and String arrays

 */