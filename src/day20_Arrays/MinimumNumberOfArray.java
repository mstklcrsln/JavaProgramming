package day20_Arrays;

public class MinimumNumberOfArray {
    public static void main(String[] args) {

        int [] numbers = {100,500,30,40,60,80,90};

        int min = numbers [0]; //100

        for (int i = 0; i < numbers.length ; i++) {                 //this loop is going to compare every single number with the current min number.

            if (numbers[i]<min) {                                           // whenever the number is smaller than the smaller number assigned to min
                min=numbers[i];
            }

        }
        System.out.println(min);


    }
}
