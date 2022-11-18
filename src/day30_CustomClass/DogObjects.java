package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1= new Dog();
        dog1.name= "Lucy";
        dog1.breed = "Husky";
        dog1.age= 5;
        dog1.color = "White";
        dog1.gender= 'F';
        dog1.size= "Small";

      //  System.out.println(dog1); day30_CustomClass.Dog@340f438e
     //   System.out.println(dog1); //Name: Lucy

        //after generate soString method in the dog class
        System.out.println(dog1); //Dog{name='Lucy', breed='Husky', age=5, gender=F, size='Small', color='White'}

        Dog dog2 = new Dog();
      /* System.out.println(dog2); it gives default values 
          Dog{name='null', breed='null', age=0, gender= , size='null', color='null'}*/
        
        dog2.name= "ACE";
        dog2.breed = "Husky";
        dog2.age= 5;
        dog2.color = "White & Black";
        dog2.gender= 'M';
        dog2.size= "Large";
       System.out.println(dog2);  // Dog{name='ACE', breed='Husky', age=5, gender=M, size='Large', color='White & Black'}

        // after setInfo method
        Dog dog3= new Dog();
        dog3.setInfo("Jack","German",5,'F',"Large","Yellow");

        System.out.println(dog3); //Dog{name='Jack', breed='German', age=5, gender=F, size='Large', color='Yellow'}

        dog1.eat();  //Lucy is eating
        dog2.bark(); //ACE is barking

        Dog dog4= new Dog();
        dog4.setInfo("Pamuk","Labrador",4,'F',"Small","Grey");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully","Pit-Bull",2,'M',"Large","Black");

        //we put all dog's into an array
        Dog[] dogs ={dog5,dog4,dog3,dog1,dog2};

        // we want to know how many female and male dogs we have and add them to the Arraylist
        ArrayList<Dog> femaleDogs= new ArrayList<>();
        ArrayList<Dog> maleDogs= new ArrayList<>();



    }
}
