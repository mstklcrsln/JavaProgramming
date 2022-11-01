package day21_ForEachLoop;

public class MaximumNumber {
    public static void main(String[] args) {

        int [] numbers= {10,5,4,20,1,0};
        int max= numbers[0];

            // first solution with for loop
        /*for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max) {
                max=numbers[i];
        }
        }*/
        // soltion with for each loop
        for (int number : numbers) {
          if (number>max){
              max= number;
          }
        }
        System.out.println(max);

    }
}
