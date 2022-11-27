package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Adam", 'M',32,90000);

        System.out.println("employee1 = " + employee1); //employee1 = Employee{name='Adam', gender=M, age=32, salary=90000.0}

        Employee employee2 = new Employee("", 'G',-32,0);

        System.out.println("employee2 = " + employee2);
        /*
        employee2 = Employee{name='null', gender= , age=0, salary=0.0}
        Invalid entry
        Invalid entryG
         */


    }
}
