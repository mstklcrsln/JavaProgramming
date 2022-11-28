package day37_Inheritence.animalTask;

public class Cat extends Animal {
        // it gives compile error at the first time because parent class has constructor with argument and we must explicitly call it

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void scratch (){
        System.out.println(name+ " is scratching");
    }


}
