package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class IteratingMultiDimensionalLoop {
    public static void main(String[] args) {

        int [][] arr2D = { {1,2,3}, {4,5,6,7} , { 8, 9, 10, 11, 12}  } ;
// outer loop get single arrays, inner loop gets the elements of the arrays
        for (int i = 0; i <arr2D.length ; i++) { // i represents index numbers of single dimensional arrays
            // System.out.print(Arrays.toString(arr2D [i]));  it gives arrays  [1, 2, 3][4, 5, 6, 7][8, 9, 10, 11, 12]
            for (int j = 0; j < arr2D[i].length; j++) {  // j represents index number of eements
                System.out.print(arr2D[i][j]+ " ");  //1 2 3 4 5 6 7 8 9 10 11 12
            }

            System.out.println(); // this is for going new line
            /*
            1 2 3
            4 5 6 7
            8 9 10 11 12
             */
        }


    }
}
