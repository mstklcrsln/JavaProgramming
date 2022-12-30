package day43_AbstractionIntro.employee;

public final class Tester extends Emloyee {

    public Tester(String name, int age, char gender, int id,  double salary) {
        super(name, age, gender, id, "Tester", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is testing the app");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " is sleeping 8 hours");
    }

    public void bugReport (){
        System.out.println(getName()+ " is creating bug report");
    }


}
