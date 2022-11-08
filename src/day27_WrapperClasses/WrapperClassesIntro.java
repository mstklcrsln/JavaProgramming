package day27_WrapperClasses;

public class WrapperClassesIntro {
    public static void main(String[] args) {

        int num1= 200;
        //Long n1= num1; is not allowed

        Integer n1= num1;   // autoboxing

        int num2= n1;       //unboxing
    /*
    A Java object is a member (also called an instance (example, case, event)) of a Java class. Each object has an identity, a behavior and a state. The state of an object is stored in fields (variables), while methods (functions) display the object's behavior. Objects are created at runtime from templates, which are also known as classes.
     */

        System.out.println("-----------------");

        Integer integerValue= 100;
        long longValue = integerValue;

        Byte b1= 25;
        byte b2= b1;
        short a2= b1;
        int a3= b1;
        long a4= b1;

        System.out.println("-----------------");

        int num3= 200;
       // long l2= num3;

        Integer num4= num3; // autoboxing














    }
}
