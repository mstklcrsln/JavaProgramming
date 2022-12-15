package day38_MethodOverriding.carTask;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", "White", 2022,65000,22000);

        Tesla tesla = new Tesla("Super", "Red", 2019,20000,52000);
        BMW bmw =new BMW("3.20", "Yellow", 2015,25000,35000);

        toyota.start(); //before overriding ===> Toyota Camry is starting
        toyota.start(); //before overriding ===> Twist the key to ignition to start Toyota Camry

        tesla.start(); // Say" Start " to Tesla Super
        bmw.start(); //BMW 3.20 is starting

    }
}
