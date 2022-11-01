package day20_Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int length= scan.nextInt(); // it will be the length of array

        if (length<=0) {
            System.err.println("Invalid entry");
            System.exit(0);
        }
        int [] numbers = new int[length]; //  length of array

        for (int i = 0; i <length ; i++) {
            System.out.println("Enter a number");
            numbers [i]= scan.nextInt(); // i is index number 0~4. each input user provided during each execution of the loop
                                                            // will be assigned to the indexes of
        }
        System.out.println(Arrays.toString(numbers));
        scan.close();
    }
}
