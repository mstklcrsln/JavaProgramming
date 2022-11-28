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


        System.out.println("------------------------");

        dog1.setInfo("Max", "Hsky",'M', 3,"Small","Green");
        dog1.drink();
        dog1.bark();
        dog1.eat();
        dog1.sleep();
        System.out.println("dog1 = " + dog1);
        /*
        Maxis drinking
        Max is barking
        Maxis eating
        Maxis sleeping
        dog1 = Animal{name='Max', breed='Hsky', gender=M, age=3, size='Small', color='Green'}
         */

        tiger1.setInfo("Sher", "Bengal", 'F', 6,"Small", "Pink");
        System.out.println(tiger1); //

        cat1.eat();
        cat1.meow();
        cat1.scratch();
        cat1.drink();
        cat1.setInfo("Mini", "Van", 'M',5,"Big", "Red");
        System.out.println("cat1 = " + cat1);
        /*
        null is eating
        null is meowing
        null is scratching
        null is drinking
        cat1 = Animal{name='Mini', breed='Van', gender=M, age=5, size='Big', color='Red'}
         */
        cat1.eat();
        cat1.meow();
        cat1.scratch();
        cat1.drink();
        System.out.println("cat1 = " + cat1);
        /*
        Mini is eating
        Mini is meowing
        Mini is scratching
        Mini is drinking
        cat1 = Animal{name='Mini', breed='Van', gender=M, age=5, size='Big', color='Red'}
         */
    }
}
