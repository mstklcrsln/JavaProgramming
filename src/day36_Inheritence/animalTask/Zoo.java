package day36_Inheritence.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Tiger tiger1 = new Tiger();
        Dog dog1= new Dog();
        Fish fish1= new Fish();

        System.out.println("fish1 = " + fish1);
        System.out.println("dog1 = " + dog1);
        System.out.println("tiger1 = " + tiger1);
        System.out.println("cat1 = " + cat1);
        /*
        fish1 = Animal{name='null', breed='null', gender= , age=0, size='null', color='null'}
        dog1 = Animal{name='null', breed='null', gender= , age=0, size='null', color='null'}
        tiger1 = Animal{name='null', breed='null', gender= , age=0, size='null', color='null'}
        cat1 = Animal{name='null', breed='null', gender= , age=0, size='null', color='null'}
         */

        dog1.name= "Kenedy";
        dog1.breed= "German";
        dog1.age=3;
        dog1.color= "Black";
        dog1.bark();
        System.out.println("dog1 = " + dog1); //dog1 = Animal{name='Kenedy', breed='German', gender= , age=3, size='null', color='Black'}



    }
}
