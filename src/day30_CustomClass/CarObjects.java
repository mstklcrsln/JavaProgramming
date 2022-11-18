package day30_CustomClass;

public class CarObjects {
    public static void main(String[] args) {

    Car car1= new Car();

       // System.out.println(car1); Car{brand='null', model='null', color='null', year=0, price=0.0}

        car1.setInfo("Toyota", "Camry","White", 2015,25000);

        System.out.println(car1); //Car{brand='Toyota', model='Camry', color='White', year=2015, price= $25000.0}

        Car car2= new Car();
        //we will put 5 cars in one variable by use data structures
      //  System.out.println(car2); Car{brand='null', model='null', color='null', year=0, price= $0.0}

        car2.setInfo("BMW", "5.20", "White", 2020,225000);
        // System.out.println(car2); Car{brand='BMW', model='5.20', color='White', year=2020, price= $225000.0}

        Car car3 = new Car();

        car3.setInfo("Audi","A4","Green",2015,65000);
        //System.out.println(car3); Car{brand='Audi', model='A4', color='Green', year=2015, price= $65000.0}


}
}
