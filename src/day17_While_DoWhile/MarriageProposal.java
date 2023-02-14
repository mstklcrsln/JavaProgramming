package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Will you mary me? Yes/no");

        String a = scan.next().toLowerCase();

        while ( !(a.equals("yes") || a.equals("no")) ) {   // we only loo for yes or no
            System.out.println("Invalid answer, please re-enter");
            a= scan.next().toLowerCase();
        }
        if (a.equals("yes") ) {
            System.out.println("Congrats");
        }else {
            System.out.println("Good Bye");
        }



    }
}
