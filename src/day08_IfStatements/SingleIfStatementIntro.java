package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 100;

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = !evenNumber; // not even number


        if (evenNumber) { // even number ---- true
            System.out.println(number + " is even number");
        }

        if (!evenNumber) { // odd number ---------- false

            System.out.println(number + " is odd number");
        }
        System.out.println("-------------------------------------");

        int n = 20;


        //positive
        if (n > 0) {
            System.out.println(n + " is positive");
        }
        //negative
        if (n < 0) {
            System.out.println(n + " is negative");
        }

        //zero
        if (n == 0) {
            System.out.println(n + " is equal to zero");
        }



        /*
        System.out.println("Odd Number");
        System.out.println("Even Number");*/
    }
}
