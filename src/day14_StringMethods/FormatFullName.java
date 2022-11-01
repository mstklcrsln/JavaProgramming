package day14_StringMethods;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName= scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        //      cyDEo
        //      SCHOOL

    //  firstName=   firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
                //C                                                        +    ydeo ==>Cydeo

        firstName= (" "+ firstName.charAt(0) ).toUpperCase()+ firstName.substring(1).toLowerCase();     // we used charAt method
        System.out.println("firstName = " + firstName); //==>Cydeo



    }
}
