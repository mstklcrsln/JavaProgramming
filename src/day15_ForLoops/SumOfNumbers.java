package day15_ForLoops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

    int  sum= 0;

        for (int i = 1; i < 101; i++) {  // shortcut of for loop for+i fori plus enter
            // 1+2+3+4+....99
            sum +=i; // additional operator // 5050
        }
        System.out.println(sum);


        System.out.println("---------------------------------------");

        // we want to user to enter 5 numbers and we will find the sum of those numbers
        int total=0;
        Scanner scan= new Scanner(System.in);

         /*  System.out.println("Enter a number");
        total+= scan.nextInt(); // we add the user input and the total number 1.nd number

      System.out.println("Enter a number");
        total+= scan.nextInt(); // we add the user input and the total number 2.nd number

        System.out.println("Enter a number");
        total+= scan.nextInt(); // we add the user input and the total number 3.nd number

        System.out.println("Enter a number");
        total+= scan.nextInt(); // we add the user input and the total number 4.nd number

        System.out.println("Enter a number");
        total+= scan.nextInt(); // we add the user input and the total number 5.nd number */

        for (int i = 0; i < 5; i++) {   // do the process 5 times
            System.out.println("Enter a number");
            total+= scan.nextInt();
        }
        scan.close();
        System.out.println(total); // we get the sum of five numbers which user entered

    }
}
