package day31_Constructors;

public class Student {
    public String name;
    public char gender;
    public int age;
    public char grade;
    public int ID;

    public Student(String name, char gender, int age, char grade, int ID) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
        this.ID = ID;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", grade=" + grade +
                ", ID=" + ID +
                '}';
    }
}
