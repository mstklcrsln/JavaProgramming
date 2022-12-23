package day41_ExceptionsIntro;

public class FinallyBlock {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        try {
            System.out.println(arr[100]);
            System.out.println("try block");
        } catch (RuntimeException e) {
            System.out.println("catch block");
            e.printStackTrace();
        } finally {
            System.out.println("Finally block");
        }
        /*
        in the console

        catch block
        Finally block
        java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 4
            at day41_ExceptionsIntro.FinallyBlock.main(FinallyBlock.java:9)

        Process finished with exit code 0


        if we put
         } catch (ArithmeticException e) {
         console is like this

        Finally block
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 4
	at day41_ExceptionsIntro.FinallyBlock.main(FinallyBlock.java:9)

Process finished with exit code 1

         */
        System.out.println("----------------");
        // to terminate the program before finally block
        int[] arr1 = {1, 2, 3, 4};

        try {
            System.out.println(arr1[100]);
            System.out.println("try block");
        } catch (RuntimeException e) {
            System.out.println("catch block");
            e.printStackTrace();
            System.exit(0);
        } finally {
            System.out.println("Finally block");
        }
        /*
        in the console:

        catch block
        java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 4
	        at day41_ExceptionsIntro.FinallyBlock.main(FinallyBlock.java:9)
        java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 4
	    at day41_ExceptionsIntro.FinallyBlock.main(FinallyBlock.java:44)

        Process finished with exit code 0
         */
    }
}
