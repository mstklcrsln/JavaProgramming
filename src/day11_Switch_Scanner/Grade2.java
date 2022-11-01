package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {

        char ch= 'A';

        switch (ch) {
            // ABCD passed, E failed
            case 'A' :
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;
            default:
                System.out.println("Failed");
        }


    }
}
