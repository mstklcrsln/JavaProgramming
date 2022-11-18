package day30_CustomClass;

public class Employee {
    // name, ID, gender, jobTitle, salary, isFulltime (boolean)

    public String name;
    public int age;
    public char gender;
    public double salary;
    public int ID;
    public String jobTitle;
    public boolean isFullTime;

    public void setInfo (String name, int age, char gender, double salary, int ID, String jobTitle, boolean isFullTime) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary= $" + salary +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work (){
        System.out.println(jobTitle+ " "+ name + " is working");
    }
}
