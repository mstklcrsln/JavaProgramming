package day17_While_DoWhile;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {

        for (char i = 'A'; i <='Z' ; i++) {
          //  System.out.print(i+ " "); //A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
            // we want to stop execution in the E
            System.out.print(i+ " ");       //A B C D E
            if (i=='F') {
                break;          // exits the loop
            }
          //  System.out.print(i+ " ");
        }

        System.out.println();
        System.out.println("------------------------------");

        Scanner scan= new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if (num<0) {  // when user gives a negative number loop will stop
                break;
            }
        }

        System.out.println("-------------------------------------");

    }
}
