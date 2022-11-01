package day07_Operators;

public class Castings {
    public static void main(String [] args) {
            float averageScore = 20.5f;

            byte num1 = (byte)averageScore; //explicit casting
        short num2= (short) averageScore;  //explicit casting
        int num3= (int) averageScore;  //explicit casting
        float num4 = averageScore;   //no casting
        long num5 = (long) averageScore;  //explicit casting
        double num6 = averageScore; //implicit casting

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);








    }




}
