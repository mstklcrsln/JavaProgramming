package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scan.nextInt(); // if user gives 150 it will not be valid. we want 1~120
                                                // also user put -20 we want to re-enter

        while (! (age>=1 && age<=120) ) { // if user put invalid system ask the user to put a number again
            System.err.println("Invalid entry, please re-enter");
            System.err.println("Enter your age :");
            age = scan.nextInt();
        }
        System.out.println("Are you a US citizen? yes/no");
        String answer= scan.next();

        while ( !(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid entry, please eenter");
            System.err.println("Are you a US citizen? yes/no");
            answer= scan.next().toLowerCase();
        }

        if (age>=18 && answer.equals("yes")) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }


    }
}
