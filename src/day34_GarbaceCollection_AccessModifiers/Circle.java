package day34_GarbaceCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;

    public static String name;

    public static ArrayList<Integer> numbers;


    public Circle (double radius){
        this.radius=radius;
       // pi=3.14; this not false but not efficient way
    }
        static {
        pi= 3.14;
        name= "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        }

}
