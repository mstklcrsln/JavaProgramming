package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ForEachLoopForMultiDimensionArrays {
    public static void main(String[] args) {

        int [][] arr2D = { {1,2,3}, {4,5,6,7} , { 8, 9, 10, 11, 12}  } ;
//
        for (int [] each1DArray : arr2D ) {
           // System.out.println(Arrays.toString(each1DArray));
        /*
        [1, 2, 3]
        [4, 5, 6, 7]
        [8, 9, 10, 11, 12]
         */
                for ( int eachelement: each1DArray ){
                    System.out.print(eachelement+ " "); //1 2 3 4 5 6 7 8 9 10 11 12
            }
        }
    }
}
