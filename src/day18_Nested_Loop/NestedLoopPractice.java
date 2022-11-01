package day18_Nested_Loop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        // there are two diferent while loops in outer while loop
        while (true) {

            System.out.println("Enter your age");
            int age = scan.nextInt();

            while (!(age > 0 && age <= 120)) {            // while the age is invalid this is the loop for getting valid age
                System.err.println("Invalid entry. Please re-enter your age");
                age = scan.nextInt();
            }

            System.out.println("Would like to continue");
            String a= scan.next().toLowerCase();

            while ( ! (a.equals("yes") || a.equals("no"))) {   // while the answer  is invalid this is the loop for getting valid answer
                System.err.println("Invalid entry. Please re-enter. Would like to continue");
                a= scan.next().toLowerCase();
            }

            if (a.equals("no")) {       //this is in the outer loop to braek
                break;
            }
        }scan.close();

    }
}
