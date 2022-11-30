package day37_Inheritence.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {


        Dog dog1= new Dog("Kelly","German", 'F',4,"S", "Green",99);

        Cat cat1= new Cat("Sally", "Van Cat", 'M',9,"M","Pink");

        Parrot parrot1= new Parrot("Birdy", "Fly", 'M', 5, "XL","Black");

        System.out.println(dog1);
        dog1.bark();
        dog1.drink();
        dog1.eat();

        System.out.println(cat1);
        System.out.println(parrot1);
        /*
        Animal{name='Kelly', breed='German', gender=F, age=4, size='S', color='Green'}
        bark
        Kelly is drinking
        Kelly is eating
        Animal{name='Sally', breed='Van Cat', gender=M, age=9, size='M', color='Pink'}
        Animal{name='Birdy', breed='Fly', gender=M, age=5, size='XL', color='Black'}
         */

    }
}
