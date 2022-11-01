package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrays2 {
    public static void main(String[] args) {

        int [] arr1= {1,2,3};
        int [] arr2= {4,5,6};
        int [] arr3= {7,8,9};


        int [][] arr2D = { {1,2,3},   {4,5,6},  {7,8,9}   };

        // 3 demantional array MUST contains 2 d array




        //indexes of 2d            0           1               2                   0                       1               2
        int [][][] arr3D = { { {1,2,3},   {4,5,6},  {7,8,9}},         { {10,20,3},   {40,50,60},  {70,80,90}}   };
                    //indexes           0                                                                       1

        // first [] is for index number of  2D arrays
        // second [] is for index  number of  1D arrays
        // third []  is for index number of elements
        System.out.println(Arrays.deepToString(arr3D));  //[[[1, 2, 3], [4, 5, 6], [7, 8, 9]], [[10, 20, 3], [40, 50, 60], [70, 80, 90]]]


        // to bring [[10, 20, 3], [40, 50, 60], [70, 80, 90]]
        System.out.println(Arrays.deepToString(arr3D[1])); //[[10, 20, 3], [40, 50, 60], [70, 80, 90]]


        // bring [40, 50, 60],

        System.out.println(Arrays.toString(arr3D[1][1])); //[40, 50, 60]

        // to bring  60
        System.out.println(arr3D[1][1][2]); //60
        System.out.println("-----------------------------");

        for (int [][] each2D : arr3D) {
            for (int []  each1D: each2D ){
                for (int element : each1D ){
                    System.out.print(element+ " ");  //1 2 3 4 5 6 7 8 9 10 20 3 40 50 60 70 80 90
                }
            }
        }
        System.out.println("-----------------------------------------");

        int [][][][] arr4D = {    { { {1,2,3},   {4,5,6},  {7,8,9}}, { {10,20,3},   {40,50,60},  {70,80,90}}   },       { { {1,2,3},   {4,5,6},  {7,8,9}},  { {10,20,3},   {40,50,60},  {70,80,90}}   } };

        for ( int [][][] each3D: arr4D) {
            for (int [][] each2D: each3D) {
                for ( int [] each1D: each2D ) {
                    for ( int elements : each1D){
                        System.out.print(elements+ " "); //1 2 3 4 5 6 7 8 9 10 20 3 40 50 60 70 80 90 1 2 3 4 5 6 7 8 9 10 20 3 40 50 60 70 80 90
                    }
                }

            }

        }

    }
}
