package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = scan.nextLine(); // Java Programming Enter

        System.out.println("Enter your building number");
        String building = scan.nextLine(); // 59kl5

      //  scan.nextLine();
        System.out.println("Enter your street name");
        String street = scan.nextLine();


        System.out.println("Enter your city name");
        String city = scan.nextLine();


        System.out.println("Enter your state");
        String state= scan.nextLine();


        System.out.println("Enter your zip code");
        int zip= scan.nextInt();;

        System.out.println("fullName = " + fullName);
        System.out.println("building = " + building);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zip = " + zip);


        scan.close();
    }
}
/*
1- Enter your full name
2- Enter your building number
3- Enter your street name
4- Enter your city name
5- Enter your state
6- Enter your zip code

Display the shipping adress

 */