package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1= scan.nextInt();

        System.out.println("Enter a math operator");
        char operator= scan.next().charAt(0);

        if ( ! (operator == '+' || operator=='-')) {  // if the operator is not + or - , not valiid
            System.err.println("ınvalid mat operator: " + operator);
            System.exit(0);         //terminates the all program
        }

        System.out.println("Enter second number:");
        int num2= scan.nextInt();


        if (operator== '-') {
            System.out.println(num1-num2);
        }else  {
            System.out.println(num1+num2);
        }






    }
}
