package day35_Encapsulation;

import com.sun.security.jgss.GSSUtil;

public class CydeoStudents {

    public String name;
    public char gender;
    public int age;
    public long batchNumber;
    public int groupNumber;

    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudents(String name, char gender, int age, long batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName = "Cydeo";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName() {
        System.out.println("School name is :" + schoolName);
    }

    public static void setProgrammingLanguage() {
        System.out.println("Program is :" + programmingLanguage);
    }

    public static void printSecretCode() {
        System.out.println("Secret code is: " + secretCode);
    }

    public void attendClass() {
        System.out.println(name + " is attending class");
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    // if we need to use both static and instance variables in one method
    //if we use AT LEAST only one INSTANCE, METHOD MUST BE VOID (INSTANCE), instance method can access static method. Like toString method.
}
