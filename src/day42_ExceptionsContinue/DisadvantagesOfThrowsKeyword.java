package day42_ExceptionsContinue;

public class DisadvantagesOfThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");

        sleep(2.5);
        System.out.println("hello world");

        System.out.println("------------------------");

        System.out.println("hello");
        MorningWokOut.sleep(2.5);
        System.out.println("Cydeo");

    }
    public static void sleep (double seconds) throws InterruptedException {

    Thread.sleep((long) (seconds*1000));
    }


}
