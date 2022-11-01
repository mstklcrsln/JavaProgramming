package day21_ForEachLoop;

public class FroEachLoop {
    public static void main(String[] args) {

     /*   int [] num= {3,6,9,0,0,};

        for (int each: num) {
            System.out.print(each);*/

        int [] numbers = {10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length; i++) { // i : indexes of array
            int eachElement = numbers[i];
            // System.out.print(eachElement); 10203040506070
        }
        System.out.println("---------------------------------------------------");

        for (int each :  numbers){  // each : elements of array
            System.out.print(each);  //10203040506070

        }
        }
    }

