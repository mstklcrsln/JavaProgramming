package day09_IfStatements;

import com.sun.security.jgss.GSSUtil;

public class MedianNumber {
    public static void main(String[] args) {

        int a =100,
                b=15,
                c=20;
            //median is the number in the middle

                                //senario:  a=15, b=10  c=20    a=15, c=10, b= 20
        boolean aIsMedian = (a>b && a<c) || (a>c && a<b);

        //                     senario: b=15, a=20, c=10,              b=15, a=10 c=20,
        boolean bIsMedian = (b>c && b<a) || (b<c && b>a);

        //                     senario:

        boolean cIsMedian = !aIsMedian && !bIsMedian;
        // boolean cIsMedian = (c<a && c>b) || (c>a && c<b);


        if (aIsMedian) { // if a is median number
            System.out.println(a+ " is the median number");
        }

        if (bIsMedian) { // if b is median number
            System.out.println(b+ " is the median number");
        }

        if (cIsMedian) { // if c is median number
            System.out.println(c + " is median number");
        }

    }
}
