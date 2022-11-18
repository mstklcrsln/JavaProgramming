package day30_CustomClass;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Mesut",41,'M',2200,103, "Manager",false);

        Employee employee2 = new Employee();
        employee2.setInfo("Veli",43,'M',2250,105,"Developer",true);

        Employee employee3 = new Employee();
        employee3.setInfo("Fatma",29,'F',2500,109,"SDET",true);

        Employee employee4 = new Employee();
        employee4.setInfo("Ali", 45, 'M',2600, 111,"Senor QA", true);

        Employee employee5 = new Employee();
        employee5.setInfo("Zülal", 31,'F',3500,115,"Product owner",true);

        // we put all of them into the array
        Employee [] employees = {employee1,employee5,employee4,employee3,employee2};

        //how many are full time or part time
        int countFullTime= 0;
        int countPartTime =0;
        // find min and max salary
        double max= employees [0].salary; // this is the first employees salary in index 0. then we will compare it
        double min= employees [0].salary;
        for (Employee employee : employees) {
            if (employee.isFullTime){
                countFullTime++;
            } else{
                countPartTime++;
            }
            if (employee.salary>max){
                max= employee.salary;
            }
            if (employee.salary< min){
                min= employee.salary;
            }
        }
        System.out.println(countFullTime); //4
        System.out.println(countPartTime); //1
        System.out.println("min = " + min); //min = 2200.0
        System.out.println("max = " + max); //max = 3500.0


    }
}
