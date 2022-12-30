package day43_AbstractionIntro.employee;

public final class Teacher extends Emloyee {
    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("ooo");
    }

    @Override
    public void sleep() {
        System.out.println("ssss");
    }

}
