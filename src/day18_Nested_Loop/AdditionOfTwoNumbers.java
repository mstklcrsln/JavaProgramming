package day18_Nested_Loop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        /* we write these statement and ask user. Than we ask user that do you want to go on. if user want to go on we will make a while loop
        System.out.println("Enter your first number");
        int num1= scan.nextInt();

        System.out.println("Enter your first number");
        int num2= scan.nextInt();

        System.out.println("Addition: " + (num1+num2));*/

        while (true) {
            System.out.println("Enter your first number");
            int num1 = scan.nextInt();

            System.out.println("Enter your second number");
            int num2 = scan.nextInt();

            System.out.println("Addition: " + (num1 + num2));


            System.out.println("Would you like to continue");
            String a = scan.next().toLowerCase();
                while (!(a.equals("yes") || a.equals("no"))) { // if the answer is invalid  we make another while loop in the loop to answer is valid
                    System.err.println("Invalid entry, Please re-enter");
                    a = scan.next().toLowerCase();
                }

                if (a.equals("no")) {
                    break;      //exits the outer loop  this in the outer loop and stops outer loop
                }
        }


    }
}
