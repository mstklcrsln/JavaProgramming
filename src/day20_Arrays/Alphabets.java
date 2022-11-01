package day20_Arrays;

import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {

        // create a variable that can contain 26 characters

        char [] alphabet = new char[26];  // Z to A

    /*              i      ch
     alphabet [0]= 'Z';  // ascii number 90
     alphabet [1]= 'Y';  // ascii number 89
     alphabet [2]= 'X';  // ascii number 88
        i= indez numbers
        j= each character

      char ch= 'Z';
        for (int i = 0; i < alphabet.length ; i++, ch--) {
            alphabet [i]= ch;
        }*/
      //  System.out.println(Arrays.toString(alphabet)); [Z, Y, X, W, V, U, T, S, R, Q, P, O, N, M, L, K, J, I, H, G, F, E, D, C, B, A]

        //second solution
        for (char i= 0,  j='Z'; i<alphabet.length; i++, j--){
            alphabet [i]= j;
        }

        System.out.println(Arrays.toString(alphabet)); //[Z, Y, X, W, V, U, T, S, R, Q, P, O, N, M, L, K, J, I, H, G, F, E, D, C, B, A]
      //  System.out.println(Arrays.toString(alphabet));      // writes whole Array
        //System.out.println( alphabet [0]        );      //   Z          printing element of Array



    }
}
