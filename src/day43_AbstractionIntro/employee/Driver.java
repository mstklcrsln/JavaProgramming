package day43_AbstractionIntro.employee;

public final class Driver extends Emloyee {


    public Driver(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("dddfdffd");
    }

    @Override
    public void sleep() {
        System.out.println("sfdghfgb");
    }
}
