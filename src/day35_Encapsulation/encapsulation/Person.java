package day35_Encapsulation.encapsulation;

public class Person {

    private  String name;
    private int age;


    public String getName(){
        return name;
    }

    public void setName (String name){
        this.name= name;
    }

    public int getAge(){
        return age;
    }

    public void setAge (int age){
        if (age<0 || age> 150){
            System.err.println("Invalid age " + age);
            System.exit(0);
        }

        this.age= age;
    }
}
/*
warmup tasks:
	1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize all the fields

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */
