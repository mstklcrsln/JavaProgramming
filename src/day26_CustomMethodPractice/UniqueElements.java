package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        int [] array = {1,1,1,2,2,4,4,4,5,6,6,6,6,7,7,8};

       int [] unique= uniqueElements(array);
        System.out.println(Arrays.toString(unique)); //[5, 8] are unique elements


    }

    public static int [] uniqueElements (int [] array){
        int [] result = {};  // new int [0]
        for (int each : array) {
         if(ArraysUtility.frequencyOfElement(array,each)==1) {
           result= ArraysUtility.addElement(result,each);
         }
        }
        return result;
        }
    }



