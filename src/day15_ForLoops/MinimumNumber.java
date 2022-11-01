package day15_ForLoops;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        int min = 2147483647;
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
            int num= scan.nextInt();
            if (num<min) {
                min=num;
            } }
            scan.close();

        System.out.println("min = " + min);


    }
}


/*
write a program that asks a user to enter a number for 5 times
return the minimum number
 */