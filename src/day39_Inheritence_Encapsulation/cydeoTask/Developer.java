package day39_Inheritence_Encapsulation.cydeoTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, String jobTitle, int employeeID, double salary) {
        super(name, age, gender, jobTitle, employeeID, salary);
    }

    public void fixingBugs (){
        System.out.println(getName()+ " is fixing the bugs");
        }

    @Override
    public void work() {
        System.out.println(getName() + " is working for developing app");
    }
}
/*
 4. Create a sub class of Employee named Developer
            Override the work method
            Extra methods:
                fixingBugs()
 */