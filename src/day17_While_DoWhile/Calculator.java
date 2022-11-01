package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1= scan.nextInt();

        System.out.println("Enter your second number");
        int num2= scan.nextInt();

        System.out.println("Enter a math operator");
       //  +,-                  we want + or - from user. if user dont put these operators, compiler asks again and again until getting + or-
        char ch= scan.next().charAt(0);

       // if ( !(ch=='+' || ch=='-')) {
        while ( !(ch=='+' || ch=='-')) {
            System.out.println("Invalid operator, please re-enter");
            ch=scan.next().charAt(0);       // if we dont put this it writes infinite times "Invalid operator, please re-enter"
        }
        System.out.println( (ch=='+')? num1+num2 : num1-num2 );

      /*  for (int i = 0;  !(ch=='+' || ch=='-'); ) {                 // we can do this with for loop but nut the best solution
            System.out.println("Invalid operator, please re-enter");
            ch=scan.next().charAt(0);*/

    }
}
