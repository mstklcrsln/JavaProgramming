package day38_MethodOverriding.carTask;
import java.lang.Object;

public class Tesla extends Car {
    public Tesla( String model, String color, int year, int miles, double price) {
        super("Tesla", model, color, year, miles, price);
    }

    public void autoPilot (){
        System.out.println(brand+ " "+ model +" is autopilot mode");
    }
        //we imported import java.lang.Object;
    //this class is parent of all the classes, it is implicitly done by java
        public void start (){
            System.out.println("Say\" Start \" to " + brand+ " "+ model);
        }

}
