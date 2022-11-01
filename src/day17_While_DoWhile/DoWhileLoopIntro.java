package day17_While_DoWhile;

public class DoWhileLoopIntro {
    public static void main(String[] args) {
        boolean a= false;

        for (int i=0; a;) {
            System.out.println("Wooden Spoon - for loop");
        }
        System.out.println("-------------------------");

        while (a) {                     // it will check the condition first
            System.out.println("Wooden spoon --while loop"); // it is false so it will never write
        }

        System.out.println("-------------------------");
            // interview question. Whicc block exetuses at least 1 times. Do while loop
        do {                    // it writes wooden spoon first and than it will check the condition
            System.out.println("Wooden spoon-- do-while loop");
        } while (a) ;                  // if the condition is true then the "do block" will be repeated again.
                                            // if th condition is false do block will no repeat


        // in these conditions only do while loop will execute (write) the output
                // do while=  JUST DO IT


    }
}
