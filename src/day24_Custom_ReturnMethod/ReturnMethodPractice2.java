package day24_Custom_ReturnMethod;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {

        String str1= grade(99);
        System.out.println("str1 = " + str1); //str1 = F

        if (str1.equals("A")){
            System.out.println("Excellent");
        } else if (str1.equals("B")) {
            System.out.println("Great");
        }else if (str1.equals("C")) {
            System.out.println("good");
        }else if (str1.equals("D")) {
            System.out.println("passed");
        } else {
            System.out.println("Try again");
        }

    }
    // create a function that calculate the grade
    /*
    check the grade
    'A' : Excellent
    'B' : Great
    ....
     */

    public static String grade (int score){ // if here is void method we could not use variables anywhere else
        String result = "";
        if (score<0 || score>100) {
            result= "invalid";
        } else {
            result = (score>=90) ? "A" :(score>=80) ? "B" :(score>=70) ? "C" :(score>=60) ? "D" : "F";
        }
        return result;

    }
}
