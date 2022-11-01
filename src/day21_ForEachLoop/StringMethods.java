package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str= "java";

        char [] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars)); //[j, a, v, a]


        for ( char each:str.toCharArray() ) {
            System.out.print(each); //java
        }
        System.out.println();
        System.out.println("-------------------------------------");

        String sentence = "Wooden Spoon";

      String [] words=   sentence.split(" ");

        System.out.println(Arrays.toString(words)); //[Wooden, Spoon]


        System.out.println();
        System.out.println("-------------------------------------");

        String email = "woodenspoon@cydeo.com";

        String [] domain  =email.split("@");

        System.out.println(Arrays.toString(domain));  //[woodenspoon, cydeo.com]


        System.out.println("-------------------------------------");


        String  s= "Today is nice day. Today is Monday. Today we learn Java";

        String arr[] = s.split("\\. ");   // for only dot . we have to use double \\

        System.out.println(Arrays.toString(arr)); //[Today is nice day, Today is Monday, Today we learn Java]


    }
}
