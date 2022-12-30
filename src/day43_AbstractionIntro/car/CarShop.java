package day43_AbstractionIntro.car;

public class CarShop {
    public static void main(String[] args) {

        Honda honda = new Honda("Civic","Black",2005,2500);
        honda.start(); //start the engine
        System.out.println(honda); //Car{brand='Honda', model='Civic', color='Black', year=2005, price=2500.0}
        System.out.println(honda.getYear()); //2005
        honda.setPrice(6000);
        System.out.println(honda); //Car{brand='Honda', model='Civic', color='Black', year=2005, price=6000.0}

        Audi audi= new Audi("Q7", "White", 2015,30000);
        audi.autoPark(); //Audi has auto park feature
        System.out.println(audi); //Car{brand='Audi', model='Q7', color='White', year=2015, price=30000.0}

        Tesla tesla = new Tesla("A3", "Yellow", 2019,45000);
        tesla.electricity(); //Tesla A3 uses electricity
        System.out.println(tesla);//Car{brand='Tesla', model='A3', color='Yellow', year=2019, price=45000.0}
    }
}
