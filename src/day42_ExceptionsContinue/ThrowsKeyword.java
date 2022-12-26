package day42_ExceptionsContinue;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("------------Test 1-------------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        /*
        it gives always sleep word compile error. to avoid this we use Throws keyword
        this means "compiler you can ignore that exception"
        this used only CHECKED EXCEPTIONS
         */
        System.out.println("Cydeo");

        System.out.println("------------Test 1 Completed-------------------");

        System.out.println("------------Test 2-------------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("EU10");
        System.out.println("------------Test 2 Completed-------------------");


    }
}
