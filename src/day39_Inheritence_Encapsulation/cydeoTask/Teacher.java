package day39_Inheritence_Encapsulation.cydeoTask;

public class Teacher extends Employee {
    public Teacher(String name, int age, char gender, String jobTitle, int employeeID, double salary) {
        super(name, age, gender, jobTitle, employeeID, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching the students");
    }
}
/*
 5. Create a sub class of Employee named Teacher
            Override the work method
 */