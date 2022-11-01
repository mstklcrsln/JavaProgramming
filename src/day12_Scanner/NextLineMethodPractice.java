package day12_Scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = scan.nextInt();

        System.out.println("Enter your GPA");
        double gpa = scan.nextDouble();

        scan.nextLine(); // if we don't use this code it will not work below line
        System.out.println("Yor school name");
        String schoolName = scan.nextLine();

       scan.nextLine(); // if we don't use this code it will not work below line
        System.out.println("Enter your full name :");
        String name= scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);

        //  if we are using nextLine() method ofter the other methods of scanner, we must provide one addition nextLine()



        scan.close();
    }
}
