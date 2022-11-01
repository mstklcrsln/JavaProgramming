package day18_Nested_Loop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 30,             // a= 30-7=23    -7=16  -7=9    -7=2    a is less than b  ==> condition  will false. lopp will not execute again
                b=7,
                count=0;

            while (a >= b) {
                // after first exection the compiler comes back to the whlle loop and execute again, if condition is  true it will go on, when condition is false it will exit the loop
                                a -=b;
                count++;

            }
        System.out.println(count+ " with a reminder of  " + a);
    }
}
/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) and %  operators.
        20 without / operaror.  6 ==> 3 with the reminder of 2
        6

        a=20
        b=6

        we will subtract second number from first until we come reminder there is no number or second is bigger than first
        a-=b;   // a=14;
         a-=b;   // a=8;
          a-=b;   // a=2; ==> 6 is bigger than 2 and loop will finish

          while (a >=b) it will stop when a<b
                    a-=b;
                    count++; // count give us how many times we did the subtraction operator.
                    what is a has laft at the end is reaminder

 */