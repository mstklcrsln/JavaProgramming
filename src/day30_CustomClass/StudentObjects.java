package day30_CustomClass;

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

    }
}
