package day42_ExceptionsContinue;

public class MorningWokOut {

    public static void main(String[] args) {

        System.out.println("------------Push up started--------------------");

        for (int i = 1; i <=30 ; i++) {
            System.out.print("\rPush up "+ i); //we use new escape sequence
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("------------Push up completed--------------------");
        /*
        ------------Push up started--------------------
        Push up 30
        ------------Push up completed--------------------
         */

        System.out.println("------------Pull up completed--------------------");

        for (int i = 1; i <=20 ; i++) {
            System.out.print("\rPull up "+ i); //we use new escape sequence
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("------------Pull up completed--------------------");

        /*
        ------------Push up started--------------------
        Push up 30
        ------------Push up completed--------------------
        ------------Pull up completed--------------------
        Pull up 20
        ------------Pull up completed--------------------
         */
    }
    // we create our own custom sleep method
    public static void sleep (double seconds){
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
