package day24_Custom_ReturnMethod;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        // create  method that can find max number between 100 and 200
      int maxNumber= max(100,200);
        System.out.println("maxNumber = " + maxNumber); //maxNumber = 200

        // multiple max by 2
       int multiplication= maxNumber *2;
        System.out.println("multiplication = " + multiplication); //multiplication = 400
    }


    public static int max (int num1, int num2) {
        int result =0;
        result= (num1>num2)? num1 : num2;
        return result;
    }




}
