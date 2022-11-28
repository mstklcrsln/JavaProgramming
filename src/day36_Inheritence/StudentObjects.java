package day36_Inheritence;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Adam", 35,'M','D',"Cydeo");

        System.out.println("student1 = " + student1); //student1 = Student{name='Adam', age=35, gender=M, grade=D}

        Student student2 = new Student("Adam", 2,'Z','O',"Cydeo");
       /* System.out.println("student2 = " + student2);
        ınvalid entry and exits the programme because of these code block:
        public void setAge (int age){
        if (age<5 || age>90){
            System.err.println("ınvalid entry");
            System.exit(0); // terminates the all code
            //return;               terminates only this method code block
         */

        student1.setAge(25);
        System.out.println("student1 = " + student1); //student1 = Student{name='Adam', age=35, gender=M, grade=D}


    }
}
