package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        String [] group1= {"john", "jack", "ali"};
        String [] group2= {"joh", "jacki", "alei"};
        String [] group3= {"johddn", "jacgk", "alikk"};

        String [] [] groups= new String[3 ][ ]; // indexes 0,1,2   if we dont konow the exact array
        groups [0] = group1;
        groups [1] = group2;
        groups [2] = group3;

      //   System.out.println(Arrays.toString(groups)); it gives hashcode       toString mthod is only for single dimensional arrays
        System.out.println(Arrays.deepToString(groups));  //[[john, jack, ali], [joh, jacki, alei], [johddn, jacgk, alikk]]


        System.out.println("-----------------------------------------");
/*
{1,2,3}
{4,5,6,7}
{8,9,10,11,12}

int [][]array= { {} , {} , {} }
 */

                // indexes  0   1   2    3    4       0 1 2 3     0 1 2
        int [][] arr2D = {{ 8, 9, 10, 11, 12} , {4,5,6,7} , {1,2,3} } ; // if we know the exact array
              //indexes         0                               1              2

        /*
         [][] for indexes of arrays and elements
         first bracket is index number of array
         second brcket is the indexes of elements
         */
        System.out.println(Arrays.deepToString(arr2D)); //[[8, 9, 10, 11, 12], [4, 5, 6, 7], [1, 2, 3]]
        //{4,5,6,7}
        System.out.println(Arrays.toString(arr2D[1]));  //[4, 5, 6, 7]

        //3 from last array
        System.out.println(arr2D[2] [2]);  //3









    }
}
/*
String [] group1= {"john", "jack", "ali"}
String [] group2= {"joh", "jacki", "alei"}
String [] group3= {"johddn", "jacgk", "alikk"}
 */