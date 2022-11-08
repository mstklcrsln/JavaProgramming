package day26_CustomMethodPractice;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int [] arr1= {1,2,3,4,5,};
        int [] arr2  = {5,6,7,8,9};
        int arr3 [] = merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3)); //[1, 2, 3, 4, 5, 5, 6, 7, 8, 9]
    }
    public static int [] merge (int [] arr1, int [] arr2){
        int [] result = new int [arr1.length+arr2.length];
        int i=0; // track the index number of third array
        for (int each : arr1) {
            result[i++]= each;
       }
        for (int each : arr2) {
            result[i++]= each;
        }return result;
    }
}
