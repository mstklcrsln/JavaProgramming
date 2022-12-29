package day43_AbstractionIntro.car;

public class Honda extends Car {

    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public void stop() {
        System.out.println("Stp the engine");
    }

    @Override
    public void start() {
        System.out.println("start the engine");
    }
}
