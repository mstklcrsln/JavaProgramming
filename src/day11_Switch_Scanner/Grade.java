package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {

        char grade = 'A';
            //String result = "";
        switch (grade) {
            case 'A':
                System.out.println("excellent");
                // result = "excellent"
                break;
            case 'B':
                System.out.println("great job");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("passed");
                break;
            case 'E':
                System.out.println("failed");
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
}
