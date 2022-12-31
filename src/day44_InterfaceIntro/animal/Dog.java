package day44_InterfaceIntro.animal;

public final class Dog extends Animal implements Playable {

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark (){

    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating meat");
    }


    @Override
    public void play() {

    }
}
