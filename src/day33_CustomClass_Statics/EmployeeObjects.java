package day33_CustomClass_Statics;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1= new Employee();
        employee1.name= "Mesut";
        employee1.salary= 110000;

        Employee employee2= new Employee();
        employee2.name = "Veli";
        employee2.salary= 210000;

        Employee employee3= new Employee();
        employee3.name= "Osman";
        employee3.salary= 310000;


        System.out.println(employee1.name+ " " +employee1.salary); //all salaries are same with using static keyword in the custom class
        System.out.println(employee2.name+ " " +employee2.salary);
        System.out.println(employee3.name+ " " +employee3.salary);

        /*
       with public static, it writes
        Osman Osman Osman

        but it writes Mesut Veli Osman with only public. And this is instance variable

        salary:
        with only public
        Mesut 110000.0
        Veli 210000.0
        Osman 310000.0
         */

    }
}
