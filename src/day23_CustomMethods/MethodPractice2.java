package day23_CustomMethods;

public class MethodPractice2 {
    public static void main(String[] args) {

        helloWorld5Times();
        helloCydeo5Times();
        /*
        Hello World
        Hello World
        Hello World
        Hello World
        Hello World
        Hello Cydeo
        Hello Cydeo
        Hello Cydeo
        Hello Cydeo
        Hello Cydeo
         */
        evenNumbers(); //246810
    }

    // create a function that can print hello wrold 5 times ==>helloWorld5Times
    public static void helloWorld5Times () {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World");
        }
    }

    public static void helloCydeo5Times () {
        for (int i = 0; i <5; i++) {
            System.out.println( "Hello Cydeo");
        }
    }

    //  create a function that can print hello cydeo 5 times==>helloCydeo5Times

    // create a function that can print all even numbers from 1 to 10  ==>evenNumbers

    public static void evenNumbers () {
        for (int i = 2; i <=10 ; i+=2) {
            System.out.print(i);

        }
    }
}
