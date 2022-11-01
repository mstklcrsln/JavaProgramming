package day21_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,30,45,50,55,60,65};
        double sum= 0;


        for (int number : numbers) {
            sum +=number; // we get the sum of all numbers
        }
        double averageNumber = sum/numbers.length;

        System.out.println("averageNumber = " + averageNumber);


    }
}
