package day08_IfStatements;

import javax.security.auth.login.FailedLoginException;

public class GradeReport {
    public static void main(String[] args) {

        int score= 85;

        boolean a= score>=90 && score <=100;
        boolean b= score>80 && score<=89; //we can write !a either >=89
       //   second way:      boolean b= score>=&& !a; // if score is A, but score is greater then  80
        boolean c= score>=70 && score<=79;
     //  second way:   boolean c= !a && !b && score<=70; // score is not a and b but greater then 70

        boolean d= score>=60 && score<=69;
        boolean f = score>=0 &&  score<=59;
        //  second way:     boolean f = !a && !b && !c && !d;

        if (a) { // if the student made A
            System.out.println("Excellent");
        }
        if (b) {// if the student made B
            System.out.println("Great");
        }
        if (c) {// if the student made C
        System.out.println("Good");
        }
        if (d) {// if the student made D
            System.out.println("Passed");
        }
        if (f) {// if the student made F
            System.out.println("Failed");
        }

    }
}
/*
score: 90-100 Excellent
            80-89 Great
            70-79  Good
             60-69 Passed
             0-59 Failed





        System.out.println(true == !false);// true
        System.out.println( !true !=false); //false
        System.out.println(!false == true); // true

        System.out.println(!!false);// false
        System.out.println(!!!true); //false

 */
