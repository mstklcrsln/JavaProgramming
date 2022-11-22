package day31_Constructors.scrumTask;

public class Tester {
    public String name;
    public int employeeID;
    public String JobTitle;
    double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        JobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    // creating methods

    public void smokeTesting(){
        System.out.println(name+ " is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+ " is creating ticket" );
    }
    public void dailyStandUp(){
        System.out.println(name+ " is in the daily stand-up");
    }

}
/*
Scrum Task:
	create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary
	        Add A constructor that can set all the fields
	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()
 */