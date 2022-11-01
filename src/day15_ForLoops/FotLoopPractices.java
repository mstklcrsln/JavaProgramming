package day15_ForLoops;

public class FotLoopPractices {
    public static void main(String[] args) {

        for (int i=15; i<=45; i++) {        // it will write 15~45
            System.out.print(i+ " "); }          // we  did not use println only print  always ask yourself 'do ı need to replace this?'

        System.out.println(); // we will put  empty line
        System.out.println("Hello ");

        System.out.println("----------------");

        // 100 99 98 97 .....50
        // i is a new variable here
        for (int i =100; i>=50; i--) {  // i= 100 99 98 97 .....50 always need double check         >49  ==     <=50
            System.out.print(i+ " ");           //
        }
        System.out.println();
        System.out.println("Hello");

        System.out.println("---------------------");

        // print all the even numbers 1~55

      //
        // for (int i =0; i<=55; i+=2 ){ //0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54
           for (int i= 1; i<=55; i++) {
               if (i%2==0) {  // number /2 =0
                   System.out.print(i+" ");
               }
    }

        System.out.println();
        System.out.println("----------------------------");
        // same task print all the even numbers 1~55
        for(int i=2; i<=55; i+=2) {
            System.out.print(i+ " ");
        }
        System.out.println();

        for (char i= 'a'; i<='z'; i++){
            System.out.print(i+ " ");
        }



    }
}
