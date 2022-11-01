package day15_ForLoops;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max= -2147483648;       // the minimum number can be an intiger

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num= scan.nextInt();            // we get a number from user

            if (num>max) {  // if the entered number is bigger than we get that number to the temporary max
                max=num;
            } }
        scan.close();
        System.out.println(max+ " is the maximum number");
    }
}
/*
write a program that asks a user to enter a number for 5 times
return the maximum number
 */