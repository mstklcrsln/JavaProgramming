package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        int [] array = {1,1,1,2,2,4,4,4,5,6,6,6,6,7,7,8};

       int [] unique= uniqueElements(array);
        System.out.println(Arrays.toString(unique)); //[5, 8] are unique elements

        System.out.println("-----------------");

        double [] doubleArray = {11.5,11.5,11.5,10.5,5.5,5.5,5.5,5.5,4.5};

        double [] uniq= uniqueElements(doubleArray);

        System.out.println(Arrays.toString(uniq)); //[10.5, 4.5]

        System.out.println("-----------------");

        char [] charArray ={ 'F','F','F','F','D','C','C','C','B','B','B','A'};
        char [] uniqChars = uniqueElements(charArray);
        System.out.println(Arrays.toString(uniqChars)); //[D, A]

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
    }



