package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of circle:");

       // scan.nextDouble();
        // if we re-use the double  after this line we must assign it to a variable like below
        double r =  scan.nextDouble();

        double area = r*r*3.14;
        double perimeter = 2*r*3.14;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

        scan.close();

    }
}
