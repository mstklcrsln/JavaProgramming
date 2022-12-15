package day38_MethodOverriding.carTask;

public class Toyota extends Car {

    public Toyota( String model, String color, int year, int miles, double price) {
        super("Toyota", model, color, year, miles, price);
    }

    public void reliable (){
        System.out.println(brand+ " "+ model+ " is reliable");
    }
        @Override
        public void start (){ //this is start method's method overriding from car class
         System.out.println("Twist the key to ignition to start "+ brand+ " " + model);
    }

}
