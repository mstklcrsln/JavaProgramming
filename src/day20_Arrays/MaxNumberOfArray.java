package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int [] numbers = {10,5,4,20,1,0};
                int max = numbers[0]; // we assume that first number (in index 0) is the biggest, and next compare every single element one by one . if the new element is bigger i will change it

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] >max) { // if there is element in the array that is greater than the current max number
            max = numbers[i]; // we asiigne the greater number to max
            }
        }
        System.out.println(max);

        // shortcut of loop starting from index. ==> numbers.fori
      // for (int i = 0; i < numbers.length; i++) {


        // shortcut of loop reverse  the loop . ==> numbers.forr
      //  for (int i = numbers.length - 1; i >= 0; i--) {





    }
}
