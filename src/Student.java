import java.util.Arrays;
// to use two different classes in one class
// create another class in the src folder

public class Student {

    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;


    public Student(String name) {
        this.name = name;
    }
    public Student(String name, char gender) {
        this(name);
        this.gender= gender;
    }
    public Student(String name, int studentID) {
        this(name);
        this.studentID= studentID;
    }
    public Student( String name, int studentID, char grade) {
        this(name,studentID);
        this.grade= grade;
    }
    public Student(String name, char gender, int age) {
        this(name, gender);
        this.age= age;
    }
    public Student(String name, char gender, int age, int studentID) {
        this(name,gender,age);
        this.studentID = studentID;
    }
    public Student(String name, char gender, int age, int studentID, char grade) {
        this(name, gender,age,studentID);
        this.grade = grade;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }

    public void  study (){
        System.out.println(name + " is studying now");
    }

}

class StudentObjects {
    public static void main(String[] args) {

        day33_CustomClass_Statics.Student student1 = new day33_CustomClass_Statics.Student("Ahmet");
        System.out.println(student1); //Student{name='Ahmet', gender= , age=0, studentID=0, grade= }

        day33_CustomClass_Statics.Student student2= new day33_CustomClass_Statics.Student("Aygun", 'F');

        day33_CustomClass_Statics.Student student3= new day33_CustomClass_Statics.Student("Niagar", 103);

        day33_CustomClass_Statics.Student student4 = new day33_CustomClass_Statics.Student("Mesut", 'M', 41);

        day33_CustomClass_Statics.Student student5 = new day33_CustomClass_Statics.Student("Veli", 'M',35,108);

        day33_CustomClass_Statics.Student student6 = new day33_CustomClass_Statics.Student("Muhtar", 'M', 33,109,'A');
        System.out.println(student6); //Student{name='Muhtar', gender=M, age=33, studentID=109, grade=A}

        day33_CustomClass_Statics.Student[] students = {student1, student4, student2, student3,student6,student5};

        System.out.println(Arrays.toString(students));
        /*
       [Student{name='Ahmet', gender= , age=0, studentID=0, grade= }, Student{name='Mesut', gender=M, age=41, studentID=0, grade= }, Student{name='Aygun', gender=F, age=0, studentID=0, grade= }, Student{name='Niagar', gender= , age=0, studentID=103, grade= }, Student{name='Muhtar', gender=M, age=33, studentID=109, grade=A}, Student{name='Veli', gender=M, age=35, studentID=108, grade= }]
         */
    }
}