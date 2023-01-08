package day46_Polymorphism_Intro;

import day30_CustomClass.Car;
import day39_Inheritence_Encapsulation.shape.Circle;
import day43_AbstractionIntro.employee.*;
import day44_InterfaceIntro.animal.*;

import java.util.ArrayList;

public class PolymorphismIntro {
    public static void main(String[] args) { //Parent can always referans to the child. That is polymorphism

        String str= "Adam";
        Integer n1= 2;
        Double n2= 5.5;
        Boolean r1= true;

     Object [] array= {str, n1, n2, r1};  //object is the parent class

        Object [] array1= {str, n1, n2, r1, new Circle(5), new Car()};


        Tester tester = new Tester("Mesut", 41, 'M',301,2500);
        Teacher teacher = new Teacher("Muhtar", 35,'M', 205,"teacher", 2000);
        Driver driver= new Driver("f", 25,'F', 250,"driver", 1500);
        Developer developer = new Developer("Adam", 32, 'M',309,"Developer", 3200);

        ArrayList <Emloyee> cydeoEmployees = new ArrayList<>();

        System.out.println("------------------------------");

        Emloyee employee = new Tester("Mesut", 41, 'M',301,2500);

        employee.work(); //Mesut is testing the app          it takes this from day 43 emloyee package tester class


        Emloyee muhtar = new Teacher("Muhtar", 35,'M', 205,"teacher", 2000);
        muhtar.work(); //ooo          // it takes this from day 43 emloyee package, teacher class

        System.out.println("------------------------");

        Animal animal = new Cat("Boby", "German", 'F',5,"middle", "black");

        animal.drink(); //Boby is drinking
        animal.eat();       // this empty because there is no method overriding in cat class in day 44
       // animal.bark();    we can not reach this, because dog method
        System.out.println("------------------------");

        Playable animal2= new Dog("Dery", "German", 'F',5,"middle", "black");

        animal2.play();
        //   animal2.drink();       we can not reach this, because no overriding
        System.out.println("------------------------");

        Animal animal3 = new Eagle("Flyer", "African", 'F',5,"middle", "black");
        animal3.eat();      //Flyer eats snake
        animal3.drink();        //Flyer is drinking
        animal3.setAge(6);
        System.out.println("animal3 = " + animal3); //animal3 = Eagle{name='Flyer', breed='African', gender=F, age=6, size='middle', color='black'}


    }
}



























