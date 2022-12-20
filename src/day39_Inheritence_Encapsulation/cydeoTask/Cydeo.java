package day39_Inheritence_Encapsulation.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Developer developer1 = new Developer("Muhtar",32,'M',"Game developer", 66900,125000);
        Tester tester1= new Tester("Mesut", 41,'M',"SDET", 66500,120000);
        Teacher teacher1= new Teacher("Asiya", 25, 'F', "Course Teacher", 66400, 110000);
        Student student1 = new Student("Fatma", 29, 'F', 66200, "SDET course student");

        System.out.println(developer1);
        System.out.println(tester1);
        System.out.println(teacher1);
        System.out.println(student1);
        /*
        Employee{name='Muhtar', age=32, gender=M, jobTitle='Game developer', employeeID=66900, salary=125000.0}
        Employee{name='Mesut', age=41, gender=M, jobTitle='SDET', employeeID=66500, salary=120000.0}
        Employee{name='Asiya', age=25, gender=F, jobTitle='Course Teacher', employeeID=66400, salary=110000.0}
        Student{name='Fatma', age=29, gender=FstudentID=66200, fieldOfStudy='SDET course student'}
         */

        System.out.println("---------------------");

        developer1.setAge(25);
        System.out.println(developer1); // age has changed      ==> Employee{name='Muhtar', age=25, gender=M, jobTitle='Game developer', employeeID=66900, salary=125000.0}

        System.out.println("------------------");

        developer1.work(); //Muhtar is working for developing app
        tester1.work(); //Mesut is testing the application
        teacher1.work(); //Asiya is teaching the students

        System.out.println("-------------------");

        developer1.eat();
        developer1.sleep();
        developer1.drink();
        developer1.fixingBugs();
    /*
        Muhtar is eating
        Muhtar is sleeping
        Muhtar is drinking
        Muhtar is fixing the bugs
     */
    }


}


/*
 7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student
            test all the functions of each objects
            Analyze the relationships between the classes
 */