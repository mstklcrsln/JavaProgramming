package day20_Arrays;

import java.util.Arrays;

public class ZToA {
    public static void main(String[] args) {
        char[] letters2 = new char[26]; //we write Z to A,

        for (int i = letters2.length-1, j='A'; i >= 0 && j<='Z'; i--, j++) {
            letters2[i]= (char)j;

        }

        System.out.println(Arrays.toString(letters2));
       //
        // for (int i = 26, j = 'Z'; i <= 0 && j > 'A'; i--, j--) {
         //   letters2[i] = (char) j;


        }
    }
