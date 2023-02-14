package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        // create a variable that's capable enough to contain 5 names

        String  [ ]myGroup= new String[5];  // index numbers 0~4
       //  System.out.println( myGroup);  this is wrong way and gives error  hashcode [Ljava.lang.String;@511baa65
        System.out.println(Arrays.toString(myGroup));  //[null, null, null, null, null]

        myGroup [2]= "mesut";

        System.out.println(Arrays.toString(myGroup));  //[null, null, mesut, null, null]


        myGroup [1] = "Gunay";
        myGroup [0] = "memo";
        myGroup [3] = "ali";
        myGroup [4] = "veli"; // we write 2 times 4 it will give null and writes the second.
        System.out.println(Arrays.toString(myGroup)); //[memo, Gunay, mesut, ali, veli]


        System.out.println("---------------------------------------------");

                String days [] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days)); //[Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]

        int number =5;

       if (number<1 || number>7) {
           System.err.println("Invalid number");
           System.exit(0);
       }
        System.out.println(days[number-1]);

        System.out.println("------------------------------------------------");
        int monthNumber=12;

        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December",  };
        if (number<1 || number>12) {
            System.err.println("Invalid number");
            System.exit(0);}

            System.out.println(months [monthNumber-1]);
    }

}
