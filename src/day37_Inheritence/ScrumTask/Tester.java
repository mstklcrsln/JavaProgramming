package day37_Inheritence.ScrumTask;

public class Tester extends Employee { // tester is an employee, Tester is a person also

    public Tester(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender, jobTitle, ID, salary, companyName);
    }

    public void createTicket (){
        System.out.println(jobTitle+ " "+ name + " is creating ticket");
    }
    // we will be able to use toString method from parent class's so we not create
}
