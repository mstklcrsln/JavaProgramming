package day18_Nested_Loop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your username");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();
        // we have two option : the inpt is valid or not valid. so we can use if else blog
        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {     // if username and pass is true
            System.out.println("Logged In");
        }else {                                                                                   // if username and pass is not  true

            for (int i = 1; i <4; i++) {  // if we use i = 0 we must write i <=3   other int i= 1; i<4 so the loop will execute 3 times
                System.out.println("Incoorect user name or password");
                System.out.println("Enter your username");
                u= scan.next();
                System.out.println("Enter your password");
                p= scan.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {     // if username and pass is true
                    System.out.println("Logged In");
                    break;
                }
            }

            if ( ! (u.equals("Cydeo") && p.equals("WoodenSpoon"))) {            // if username and pass is not  true we are still in else block
                System.err.println("Your account is locked. Please contact support team");
            }
        } scan.close();
    }
}
/*
2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should
                for(int i = 1; i <= 3; i++){

    		if(valid){
    			sout("Loged In")
    			break;
    		}

    		if( i==3){
    			sout(Your account is locked)
    		}
 */