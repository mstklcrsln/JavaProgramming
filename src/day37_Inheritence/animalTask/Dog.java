package day37_Inheritence.animalTask;

public class Dog extends Animal {

    // we must call super class's constructor
        public int a; // added new instance wariable
    public Dog (String name, String breed, char gender, int age, String size, String color, int a){
        super(name, breed, gender, age, size, color);
        this.a=a; // we added later and we need to assign it to the object
    }
    public void bark (){
        System.out.println("bark");
    }

}
