package day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age= scan.nextInt();

        System.out.println("Enter your gender");
        String gender= scan.next();

        scan.nextLine();
        System.out.println("Enter your full name");
        String fullName= scan.nextLine();

        scan.nextLine();
        System.out.println("Enter your phone number");
        long phoneNumber= scan.nextLong();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

       scan.nextLine();
        System.out.println("Enter your school name");
        String schoolName= scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name");
        String stateName= scan.next();

        System.out.println("Enter your building number");
        int buildingNumber = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your street name");
        String streetName = scan.nextLine();;
    scan.close();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("Adress : \n\t " + buildingNumber+ " " + streetName+ "\n\t" + cityName+ ", " +stateName+ zipCode);
        System.out.println("schoolName = " + schoolName);
    }
}
