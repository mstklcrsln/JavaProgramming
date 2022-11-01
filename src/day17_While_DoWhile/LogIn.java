package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        //username: "Cydeo"
        //password : "Cydeo123"

       // int attempt= 3;
        // while (it is invalid &&has attempts)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name");
        String u = scan.next();
        System.out.println("Enter your password");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")) {        // if the credentials are valid
            System.out.println("Logged in");
        } else {
            int attempts=3;

           while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts>0 ) {
               if (attempts==1) {
                   System.out.println("YOUR LAST CHANCE");
               }
           // while ( !(u.equals("Cydeo")) && p.equals("Cydeo123") && attempts>0) { // while the credentals are not  invalid, and user has attempts to re-enter
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your user name");
                u= scan.next();

                System.out.println("Enter your password");
                p= scan.next();
               attempts--;
            }
            if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                System.out.println("Logged in");
            }else {
                System.out.println("Your account is locked.");
        }
        }

    }}

