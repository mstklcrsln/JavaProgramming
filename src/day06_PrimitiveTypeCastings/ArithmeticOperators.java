package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(10+20);
        System.out.println(100-50);
        System.out.println(10*55);
        System.out.println((double)10/4); //dont give decimals in java
        System.out.println(125%7);
        System.out.println(7*17);
        System.out.println(50.0/9);
        System.out.println((double) 100/3);
        System.out.println(75/(double)9);

        //if it is int we can cast it to double by putting (double) before the number
        // also we can add  "D" or "d"  one of the numbers. (decimal = d)
        // or we can put a decimal to one of the numbers

        int a = 100;
        double b = a/6;

        System.out.println(b);
    }
}

/**
   + : Addition
   - : Subtract
   * : Multiplication
   / : Division it will give intiger numbers
   % : Remainder - kalan
 */
