package day39_Inheritence_Encapsulation.cydeoTask;

public class Person {
    private String name;
    private int age;
    private char gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    } // constructor applies us to rlete sub class to this class's private instances
    // with constructor all the sub classes will have relation with this parent class,
    // whenever the object is created does that mean that we're making sure the right name, gender and age, the right arguments are given to set those instnaces
    // because those setters can also check the requirements/conditions

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public void eat (){
        System.out.println(name+ " is eating");
    }
    public void drink (){
        System.out.println(name + " is drinking");
    }
    public void sleep (){
        System.out.println(name+ " is sleeping");
    }
}
/*
CydeoTask:
    1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                eat()
                drink()
                sleep()
                toString()

    2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()

    3. Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()

    4. Create a sub class of Employee named Developer

            Override the work method

            Extra methods:
                fixingBugs()

    5. Create a sub class of Employee named Teacher

            Override the work method


    6. Create a sub class of Person named Student

            Extra variables:
                studentId, fieldOfStudy

            Encapsulate all the fields

            Add a constructor to set all the fields

            Encapsulate all the fields

            Methods:
                study()

    7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes

 */