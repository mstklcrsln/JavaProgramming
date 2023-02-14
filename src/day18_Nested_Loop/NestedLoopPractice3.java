package day18_Nested_Loop;

public class NestedLoopPractice3 {
    public static void main(String[] args) {


        for (int j = 0; j <11 ; j++) {
               for (int i = 0; i <j ; i++) {
            System.out.print("* ");
        }
            System.out.println();
        }
    }}

/*
Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *


 */