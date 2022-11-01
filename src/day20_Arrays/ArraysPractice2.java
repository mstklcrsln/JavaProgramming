package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        char [] letters = new char[26];  // contains 26 char elements
     //   letters [0]='A';
       // letters [1]='B'; // we will repeat over and over
/*
we create a loop for chars and also for index numbers, j is for index numbers
two variable, two condition, two iterator. j is also char
 */
        for (char i = 'A', j=0; i <= 'Z' && j<letters.length; i++, j++) { //j is index number
          letters [j] =i;
        }

       System.out.println(Arrays.toString(letters)); // [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]

        for (int i = 0, j= 'A'; i < letters.length ; i++, j++) {  // i represents index number 0~26
            letters[i]= (char)j;
        }
        System.out.println(Arrays.toString(letters));// [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]

        System.out.println("-----------------------");
        char ch ='A';
        for (int i = 0; i <letters.length ; i++) {// we can put ch++ ) {
            letters [i] =ch++;
        }
        System.out.println(Arrays.toString(letters));  //[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]

        System.out.println("---------------------");

        char []  letters2= new char[26]   ; //we write Z to A,

        for (int i = 26, j='Z'; i <letters.length && j>'A' ; i--, j--) {
            letters2 [i] =(char) j;

            System.out.println(Arrays.toString(letters2));


        }
        }
    }

