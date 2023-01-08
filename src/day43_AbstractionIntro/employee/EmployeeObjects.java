package day43_AbstractionIntro.employee;

public class EmployeeObjects {
    public static void main(String[] args) {

       Tester tester = new Tester("Mesut", 41, 'M',301,2500);
       Teacher teacher = new Teacher("Muhtar", 35,'M', 205,"teacher", 2000);
       Driver driver= new Driver("f", 25,'F', 250,"driver", 1500);
       Developer developer = new Developer("Adam", 32, 'M',309,"Developer", 3200);
        System.out.println("driver = " + driver);
        System.out.println("teacher = " + teacher);
        System.out.println("tester = " + tester);

        tester.work();
        tester.bugReport();
        tester.eat();
        tester.sleep();
        driver.sleep();
        driver.work();


    }

}
