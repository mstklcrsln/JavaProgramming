package day34_GarbaceCollection_AccessModifiers;

import day30_CustomClass.Car;
import day30_CustomClass.Dog;
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

        Dog dog1= new Dog();
        dog1.name= "Lucy";

        // System.out.println(dog1); Dog{name='Lucy', breed='null', age=0, gender= , size='null', color='null'}

        dog1  =  new Dog(); // after this line lucy is eligible for garbage collcetor

        dog1.name= "Max";

        // System.out.println(dog1); Dog{name='Max', breed='null', age=0, gender= , size='null', color='null'}


    }
}
