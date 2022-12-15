package day39_Inheritence_Encapsulation.cydeoTask;

public class Employee extends Person {

    private String jobTitle;
    private int employeeID;
    private double salary;

   /*
    public Employee(String name, int age, char gender, String jobTitle, int employeeID, double salary) {
     super(name, age, gender);
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;

        This is default constructor but we change it to check the conditions we look for the given arguments are valid or not
        the set method only can check the condition
    }
    */

    public Employee(String name, int age, char gender, String jobTitle, int employeeID, double salary) {
            super(name, age, gender);
            setEmployeeID(employeeID);
            setSalary(salary);
            setJobTitle(jobTitle);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work (){
        System.out.println(getName()+ " is working"); // if there is no constructor, we can not reach the getName
    }

    @Override
    public String toString() {  // we added parent class's instances and make them to getName method
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }
}
/*
 2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
 */