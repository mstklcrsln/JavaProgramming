package day22_MultiDimensionalArrays;

public class IteratingMultiDimensionalArrays2 {
    public static void main(String[] args) {

        int [][] arr2D = { {1,2,3}, {4,5,6,7} , { 8, 9, 10, 11, 12}  } ;
/*
task:
8 9 10 11 12
4 5 6 7 8
1 2 3
 */
        for (int i = arr2D.length - 1; i >= 0; i--) { // i represents index number of array from last index to zero

            for (int j = 0; j < arr2D[i].length; j++) {  //  arr2D[i]. represents each single dimension array
                System.out.print(arr2D[i] [j]+ " ");
            }
            System.out.println();
            /*
            8 9 10 11 12
            4 5 6 7
            1 2 3
             */
            }
        System.out.println("--------------------------------------------");
/*
task 2:
            321
            7654
             12 11 10 9 8
 */

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
        /*
        3 2 1
        7 6 5 4
        12 11 10 9 8
         */
        System.out.println("----------------------------------------------"     );
        /*
        task 3
        12 11 10 9 8
        7 6 5 4
        3 2 1
         */
        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) {
                System.out.print(arr2D[i][i1]+ " ");
            }
            System.out.println();
        }
    }
}