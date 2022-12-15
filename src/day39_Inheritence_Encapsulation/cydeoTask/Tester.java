package day39_Inheritence_Encapsulation.cydeoTask;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, String jobTitle, int employeeID, double salary) {
        super(name, age, gender, jobTitle, employeeID, salary);
    }

    public void  createTicket(){
        System.out.println(getName()+ " " + getJobTitle()+ " is creating ticket");
    }

    @Override
    public void work() {
        //super.work(); we can change these point. we can give different implementation here
        System.out.println(getName()+ " is testing the application");
    }
}
/*
 3. Create a subclass of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()
 */