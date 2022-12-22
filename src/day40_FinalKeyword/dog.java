package day40_FinalKeyword;

public class dog extends  Animal {


    public dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }
    // we don't have setters about gender, breed and color. because tey are final



    public void eat() { // we can reach and change this method
        System.out.println(getName()+ " is eating dog food");
    }

    // we can not change drink method because that is final method 
}
