package day14_StringMethods;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter your name");
        String str= scan.next();
        scan.close();



      String result=   str.replace("x", "a"). replace("X", "a");
                // acodeX                                                                           acodea

        System.out.println(result);

    }
}
