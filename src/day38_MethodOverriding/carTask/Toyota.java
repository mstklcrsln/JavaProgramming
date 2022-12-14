package day38_MethodOverriding.carTask;

public class Toyota extends Car {

    public Toyota( String model, String color, int year, int miles, double price) {
        super("Toyota", model, color, year, miles, price);
    }

    public void reliable (){
        System.out.println(brand+ " "+ model+ " is reliable");
    }

}
