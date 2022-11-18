package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

    Car car1= new Car();

       // System.out.println(car1); Car{brand='null', model='null', color='null', year=0, price=0.0}

        car1.setInfo("Toyota", "Camry","White", 2001,25000);

        System.out.println(car1); //Car{brand='Toyota', model='Camry', color='White', year=2015, price= $25000.0}

        Car car2= new Car();
        //we will put 5 cars in one variable by use data structures
      //  System.out.println(car2); Car{brand='null', model='null', color='null', year=0, price= $0.0}

        car2.setInfo("BMW", "5.20", "White", 2020,225000);
        // System.out.println(car2); Car{brand='BMW', model='5.20', color='White', year=2020, price= $225000.0}

        Car car3 = new Car();

        car3.setInfo("Audi","A4","Green",2015,65000);
        //System.out.println(car3); Car{brand='Audi', model='A4', color='Green', year=2015, price= $65000.0}

        // we use data structures to put 3 object to the same place

       // Car[] cars= {car1,car2,car3}; Array has lots of disadvantages, we can not remove objects...

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2, car3));
        // to find the most expensive car
        //or to find the brands
        for (Car each : carsList) {
            System.out.println(each.brand+ " : "+ each.price);
            /*
        Toyota : 25000.0
        BMW : 225000.0
        Audi : 65000.0
         */
        }
        System.out.println("------------");

        /* we look for eligible for recall
         recall:
            BMW: 2005~2008
            Toyota : 1999~2005
         */

        carsList.removeIf(p-> p.brand.equals("BMW") && p.year>= 2005 && p.year<=2008);
        carsList.removeIf(p-> p.brand.equals("Toyota") && p.year>=1999 && p.year<=2008);




}
}
