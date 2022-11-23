package day34_GarbaceCollection_AccessModifiers;
import utilities.MathUtility;

import static day34_GarbaceCollection_AccessModifiers.Circle.pi;
import static day34_GarbaceCollection_AccessModifiers.StaticImport.*;
import static utilities.MathUtility.*;

public class StaticImport {
    public static void main(String[] args) {

       // System.out.println(Circle.pi); //3.14
        System.out.println(pi);     //3.14


        // import static day34_GarbaceCollection_AccessModifiers.Circle.pi; //imports one member of class
        //import static day34_GarbaceCollection_AccessModifiers.*; // imports everything

        System.out.println(sumOfTwoDoubles(25.5, 0.4)); //25.9

        System.out.println(sumOfTwoIntegers(25, 99)); //124
         System.out.println(maxOfTwoDoubles(2999,25)); //2999
    }
}
