package day33_CustomClass_Statics;

import java.util.Arrays;

public class StudentsObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");
        System.out.println(student1); //Student{name='Ahmet', gender= , age=0, studentID=0, grade= }

        Student student2= new Student("Aygun", 'F');

        Student student3= new Student("Niagar", 103);

        Student student4 = new Student("Mesut", 'M', 41);

        Student student5 = new Student("Veli", 'M',35,108);

        Student student6 = new Student("Muhtar", 'M', 33,109,'A');
        System.out.println(student6); //Student{name='Muhtar', gender=M, age=33, studentID=109, grade=A}

        Student [] students = {student1, student4, student2, student3,student6,student5};

        System.out.println(Arrays.toString(students));
        /*
       [Student{name='Ahmet', gender= , age=0, studentID=0, grade= }, Student{name='Mesut', gender=M, age=41, studentID=0, grade= }, Student{name='Aygun', gender=F, age=0, studentID=0, grade= }, Student{name='Niagar', gender= , age=0, studentID=103, grade= }, Student{name='Muhtar', gender=M, age=33, studentID=109, grade=A}, Student{name='Veli', gender=M, age=35, studentID=108, grade= }]
         */
    }
}
