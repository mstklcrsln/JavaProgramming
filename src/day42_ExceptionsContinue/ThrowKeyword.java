package day42_ExceptionsContinue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age");
        int age= new Scanner(System.in).nextInt();
        if (age<0) {
          //  System.err.println("Invalid age "+ age);
            //System.exit(1);
            throw new InputMismatchException("Age can not be negative");

        }
        if (age>21){
            System.out.println("You're eligible");
        }else {
            throw new RuntimeException("You must be at least 21 years old");
        }
    }
}
