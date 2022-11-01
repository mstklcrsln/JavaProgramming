package day14_StringMethods;

import java.util.Scanner;

public class startsWithX {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a word"); // xcodex
            String word = scan.next();
        scan.close();
      //  String word= new Scanner (System.in).next(); if we get only ONE input from user we can use this



        if (word.charAt(0) =='x') {
            word= word.replaceFirst("x", "a" );
        }
        System.out.println("word = " + word);





    }
}
