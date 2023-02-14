package day19_LoopPractices;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

                if (i==3) {
              //  break; // terminates the loop
                 continue;  // skips 3  terminates the current iteration of the loop  0 1 2 4
                  //  System.exit(0); // when the condition is true it will stop the JVM. it writes 0 1 2 and finish the code
            }
            System.out.println(i);
        }
        System.out.println("Wooden Spoon");
    }
}
