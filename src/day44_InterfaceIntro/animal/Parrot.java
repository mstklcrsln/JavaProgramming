package day44_InterfaceIntro.animal;

public final class Parrot extends Animal implements Playable, Flyable {
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }

    @Override
    public void fly() {
        System.out.println(getName()+ " is can fly 100 km");
    }
}
