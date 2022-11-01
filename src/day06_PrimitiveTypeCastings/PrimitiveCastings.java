package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] argv) {
/*
        byte a =  100;
        short b = a;


      //  short b = (short) a;  compiler does this automatic.

        int c = (int)b;

        // int c = (int) b;
        //iplicit (widening) casting
        // if in the brackets are grey yo must not write them.
        //they're automatic ally done by compiler
        // in the background compiler casting b to c, because int is bigger


        long d = c;
        long d = (long)c;

        // in the backround smaller casted to larger

        float e = d;
        double f = e;
  */
        int x = 55;
        short y = (short) x;

        System.out.println(x + " : " + y);

        int a = 25515485;
        short b = (short) a;
        System.out.println(b);


        double n = 10.8;
        int s = (int) n;
        System.out.println(n + " : " + s);
        // it gives only integer digit

        //double d1 = 20.5;
     //   short s1 = (short) d1;



        //casting shortcut: alt+enter=> cast to..
        //also when mouse comes to red place, there is a solution

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(s1);

        float f1 = 30.5f;
        long l1 = (long) f1;
        System.out.println(l1);


    }
}