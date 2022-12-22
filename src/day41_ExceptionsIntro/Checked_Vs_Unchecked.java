package day41_ExceptionsIntro;

import day39_Inheritence_Encapsulation.cydeoTask.Student;

import java.io.FileInputStream;
import java.util.Locale;

public class Checked_Vs_Unchecked {


    public static void main(String[] args) throws InterruptedException {

        // unchecked exception occures during runtime/ we see the error when we run the code
        int a= 10;
        int b= 0;
     //   System.out.println(a/b); //"main" java.lang.ArithmeticException: / by zero      Process finished with exit code 1
        // code running finishes and we can not pass the next line /  crashes our program
        //without handleing we can not go other lines and code fragmanst
     //   System.out.println("wooden spoon");



        char [] characters = {'A', 'B', 'C'};
      //  System.out.println(characters[99]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 99 out of bounds for length 3      Process finished with exit code 1
        // there is no 99 index in our array


        Student student= null;
        // System.out.println(student.getName()); java.lang.NullPointerException     Process finished with exit code 1
      //  student.study(); //java.lang.NullPointerException


        String str= "Wooden Spoon";
        // str= null;

        //    System.out.println(str.toUpperCase());  java.lang.NullPointerException        Process finished with exit code 1


        // checked exceptions

        System.out.println("Hello");

        Thread.sleep(5000); // waits 5 second
        // compiler underlines the sleep word and we can not run the code

        System.out.println("World");

                                    //it redlines this word
     //   FileInputStream file = new FileInputStream("path of the file");
                                    //this is checked exception




    }

}




















