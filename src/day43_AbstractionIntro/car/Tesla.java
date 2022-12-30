package day43_AbstractionIntro.car;

public final class Tesla extends  Car {

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say \"start\" to car");
    }

    public void electricity (){
        System.out.println(getBrand()+ " " + getModel()+ " uses electricity");
    }
}
