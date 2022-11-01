package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int [] number= {2,5,6,7,5, 2, 25, 56, 1, 9, 6, 7, 8};
        System.out.println(Arrays.toString(number)); //[2, 5, 6, 7, 5, 2, 25, 56, 1, 9, 6, 7, 8]

        Arrays.sort(number); // sorts the array in ascending order

        System.out.println(Arrays.toString(number)); //[1, 2, 2, 5, 5, 6, 6, 7, 7, 8, 9, 25, 56]

    }
}
