package day20_Arrays;

public class AverageNumbers {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,30,45,50,55,60,65};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
        sum+=numbers[i];
        }

        double average = sum/numbers.length;
        // 10/3= 3

        System.out.println("average = " + average);


    }
}
