package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

     //   System.out.println("enter true or false: ");
       //boolean result =  scan.nextBoolean();

        System.out.println("Enter your name :");

        String name= scan.next();
        System.out.println("name = " + name);


    scan.close();
    }
}
