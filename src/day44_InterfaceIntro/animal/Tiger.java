package day44_InterfaceIntro.animal;

public final class Tiger extends Animal {
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating deer");
    }
}
