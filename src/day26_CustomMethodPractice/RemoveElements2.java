package day26_CustomMethodPractice;

import utilities.ArraysUtility;

public class RemoveElements2 {

    public static int [] removeElement (int [] array, int index){

        if (index<0|| index>array.length-1){  // if the given index is out of boundry
            System.err.println("Invalid index number :" + index);
            System.exit(0);
        }
        int [] result= {};

        for (int i = 0; i < array.length; i++) {
            if (i!= index){
                ArraysUtility.addElement(result,array[i]);
            }
        }return result;
    }
}
