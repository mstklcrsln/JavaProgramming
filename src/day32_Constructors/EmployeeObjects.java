package day32_Constructors;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Mesut");
        System.out.println(employee1); //Employee{name='Mesut', gender= , jobTitle='null', salary=0.0}

        Employee employee2 = new Employee("Ali", 'M');
        System.out.println(employee2); //Employee{name='Ali', gender=M, jobTitle='null', salary=0.0}

        Employee employee3 = new Employee("Veli", 'M',"Developer");
        System.out.println(employee3); //Employee{name='Veli', gender=M, jobTitle='Developer', salary=0.0}




    }
}
