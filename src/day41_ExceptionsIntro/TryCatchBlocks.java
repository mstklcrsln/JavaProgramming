package day41_ExceptionsIntro;

public class TryCatchBlocks {
    public static void main(String[] args) {

       /*
        System.out.println("Test started");
        System.out.println(9/0);
        System.out.println("Test completed");

        in the console
        Test started
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at day41_ExceptionsIntro.TryCatchBlocks.main(TryCatchBlocks.java:7)

        Process finished with exit code 1
         */

        // to handle this exception:

        System.out.println("Test started");
        try { // in the try block we will give our exception code
            System.out.println(9 / 0);

            System.out.println("Try block");
        } catch (
                ArithmeticException e) { // we put the ArithmeticException and add e, we need to specify that which class can be used for handling that exception.
            // e is a variable. variable e will contain the object of the exception that is occured.
            // every time exception is occured, exception object will be created
            // and than that object will be assigned the variable type that we give here
            System.out.println("Catch block");
            System.out.println("Arithmetic Exception was occurred");
        }
        System.out.println("Test1 completed");
        /*
        writes in the console:

        Test started
        Catch block
        Arithmetic Exception was occurred
        Test1 completed
         */
        //only the catch block has run. And exception is gun


        System.out.println("----------------------");

        /*  System.out.println("Test 2 started");
        int [] numbers = {1,2,3,4,5};
        System.out.println(numbers[200]); // we want to see the element which is in 200. index. This is a exception

        System.out.println("Test2 completed");

        System.out.println("----------------------");

        System.out.println("Test 3 started");

        writes in the console:
        Test 2 started
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 200 out of bounds for length 5
        at day41_ExceptionsIntro.TryCatchBlocks.main(TryCatchBlocks.java:49)

        Process finished with exit code 1
         */

        System.out.println("Test 2 started");
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println(numbers[200]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //if we write catch (NullPointerException e){ we can not handle the exception so we need to use right exceptionclass
            System.out.println("catch block");
        }

        System.out.println("Test2 completed");
        /*
        writes in the console:

        Test 2 started
        catch block
        Test2 completed
         */
        System.out.println("----------------------------");

        /*
        if we don't know the class we use parent class: RunTimeException Class
         */
        System.out.println("Test 3 started");
        int[] numbers1 = {1, 2, 3, 4, 5};
        try {
            System.out.println(numbers1[200]);
        } catch (RuntimeException e) { // we used parent class RuntimeException
            System.out.println("catch block");
        }

        System.out.println("Test3 completed");
        /*
        writes in the console:

        Test 3 started
        catch block
        Test3 completed
         */

        System.out.println("---------------------");

        /*
        in the catch block there are some specific methods that we can call from the exception object.

        When runtime exception happens, java will catch it and assigns to a variable in catch block
        • After it is successfully caught, we can use the variable and call some methods on the
        exception object
                • Popular methods of exception objects are:
                printStackTrace(): prints a stack trace (full details) of the exception
                • getMessage(): returns only brief description of the exception
         */
        System.out.println("Test 4 started");
        int[] numbers2 = {1, 2, 3, 4, 5};
        try {
            System.out.println(numbers2[200]);
        } catch (RuntimeException e) { // we used parent class RuntimeException
            e.printStackTrace(); // this method is very efficient for reports
        }
        System.out.println("Test 4 completed");
        /*
         writes in the console: after write everything and after that explains the exception. Not terminates the programme

        Test 4 started
        Test 4 completed
        java.lang.ArrayIndexOutOfBoundsException: Index 200 out of bounds for length 5
            at day41_ExceptionsIntro.TryCatchBlocks.main(TryCatchBlocks.java:120)

        Process finished with exit code 0
         */

        System.out.println("---------------------------------");

        System.out.println("Test 5 started");
        int[] numbers3 = {1, 2, 3, 4, 5};
        try {
            System.out.println(numbers3[200]);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); // it gives us Index 200 out of bounds for length 5
        }
        System.out.println("Test 5 completed");
    }
    /*
     writes in the console:

        Test 5 started
        Index 200 out of bounds for length 5
        Test 5 completed
        java.lang.ArrayIndexOutOfBoundsException: Index 200 out of bounds for length 5
            at day41_ExceptionsIntro.TryCatchBlocks.main(TryCatchBlocks.java:120)

        Process finished with exit code 0
     */
}
