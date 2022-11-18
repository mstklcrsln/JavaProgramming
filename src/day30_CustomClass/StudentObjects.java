package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setInfo("Mesut",'M',41,103,'A');

     //   System.out.println(student1); Student{name='Mesut Kılıcarslan', gender=M, age=41, ID=103, grade=A}

        Student student2 = new Student();
        student2.setInfo("Serkan", 'M',39,105,'B');

        Student student3 = new Student();
        student3.setInfo("Veli", 'M',42,109,'C');

        Student student4 = new Student();
        student4.setInfo("Fatma", 'F',32,117,'D');

        Student student5 = new Student();
        student5.setInfo("Zülal", 'F',29,125,'B');

        Student [] students = {student1,student5,student2,student3,student4};

       /* System.out.println(Arrays.toString(students));
       [Student{name='Mesut', gender=M, age=41, ID=103, grade=A}, Student{name='Zülal', gender=F, age=29, ID=125, grade=B}, Student{name='Serkan', gender=M, age=39, ID=105, grade=B}, Student{name='Veli', gender=M, age=42, ID=109, grade=C}, Student{name='Fatma', gender=F, age=32, ID=117, grade=D}]
        */

        for (Student student : students) {
            System.out.println(student);
        }
            /*
            Student{name='Mesut', gender=M, age=41, ID=103, grade=A}
            Student{name='Zülal', gender=F, age=29, ID=125, grade=B}
            Student{name='Serkan', gender=M, age=39, ID=105, grade=B}
            Student{name='Veli', gender=M, age=42, ID=109, grade=C}
            Student{name='Fatma', gender=F, age=32, ID=117, grade=D}
             */

            System.out.println("-----------");
            ArrayList<Student> earlyBirds= new ArrayList<>(); // grade A
            ArrayList<Student> angryBirds= new ArrayList<>();

        // to find early and angry birds
        for (Student student : students) {
            if (student.grade=='A'){ // if grade is a add to the early birds
                earlyBirds.add(student);
                } else { angryBirds.add(student);
                }
            }
        System.out.println(earlyBirds); //[Student{name='Mesut', gender=M, age=41, ID=103, grade=A}]
        System.out.println(angryBirds); //[Student{name='Zülal', gender=F, age=29, ID=125, grade=B}, Student{name='Serkan', gender=M, age=39, ID=105, grade=B}, Student{name='Veli', gender=M, age=42, ID=109, grade=C}, Student{name='Fatma', gender=F, age=32, ID=117, grade=D}]
        }
    }

