package day12_Scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        Scanner work = new Scanner(System.in);

        System.out.println("Put a number");
        int number = work.nextInt();

        System.out.println("You put : " + number);

    }
}
