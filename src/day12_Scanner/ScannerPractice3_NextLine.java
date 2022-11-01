package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name ");

        String fullName = scan.nextLine();
        System.out.println("You have input:  " + fullName);

        System.out.println("Enter your programming language");

        String program = scan.nextLine();
        System.out.println("You have entered " + program);
        // scan.nextLine(); if the line above is not apply enter we starting console by this command
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("You have entered " + age);
        scan.close();
    }
}
