package day38_MethodOverriding.carTask;

public class Tesla extends Car {
    public Tesla( String model, String color, int year, int miles, double price) {
        super("Tesla", model, color, year, miles, price);
    }

    public void autoPilot (){
        System.out.println(brand+ " "+ model +" is autopilot mode");
    }



}
