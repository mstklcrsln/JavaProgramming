package day35_Encapsulation.encapsulation;


public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        //this.name = name;
        setName(name);
        //this.gender = gender;
        setGender(gender);
        //this.age = age;
        setAge(age);
       //this.salary = salary;
        setSalary(salary);
    }

   /* public String getName (){
        return name;
    }
    public void setName (String name){
        if (name.length()<0){
            System.err.println( "Invalid entry" +  name);
            System.exit(0);
        }
        this.name=name;
    }
    right click-generate- getter and setter
    */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.err.println( "Invalid entry" +  name);
            //System.exit(0);
            return;
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender != 'F' || gender != 'M'){
            //(! (gender == 'F' || gender == 'M'))
            System.err.println( "Invalid entry" +  gender);
            //System.exit(0);
            return;
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<16 || age >90){
            return;
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<=0){
            return;
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
