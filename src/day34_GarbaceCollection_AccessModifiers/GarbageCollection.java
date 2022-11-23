package day34_GarbaceCollection_AccessModifiers;

import day30_CustomClass.Car;
import day33_CustomClass_Statics.IPhone;

public class GarbageCollection {
    public static void main(String[] args) {

        /*
        garbage collector cleans the nulls

        String str= null;
        // str= "Cydeo"; CYDEO
        str=""; // empty

        System.out.println(str.toUpperCase());
        /*
        Exception in thread "main" java.lang.NullPointerException
	at day34_GarbaceCollection_AccessModifiers.GarbageCollection.main(GarbageCollection.java:9)
         */

        String str= "Wooden spoon";
        System.out.println(str); //Wooden spoon

        str= null; // after line 22 "wooden spoon" is eligible for garbage collection
        System.out.println(str); //null

        System.out.println("----------------");

        // when we assign null old object is eligible for garbage collector

    }
}
