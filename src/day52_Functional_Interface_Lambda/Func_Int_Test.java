package day52_Functional_Interface_Lambda;

public class Func_Int_Test {
    public static void main(String[] args) {

        /*
        LAMBDA: () -> {}
         */

        // function one : create a function that can display a number is odd or even
        MyFirstFunctionalInterface oddOrEvenNumber= (n) -> {
            if(n%2==0){
                System.out.println(n+ " is even number");
            } else {
                System.out.println(n+ " is odd number");
            }
        };
        oddOrEvenNumber.apply(25); // 25 is odd number


        // function 2: create a function that can check if a person is eligible for vote
        MyFirstFunctionalInterface eligibleToVote = (age) -> {
            if(age>18){
                System.out.println("You can vote");
            }else {
                System.out.println("You can not vote"); //You can not vote
            }
        };
        eligibleToVote.apply(17);

        //function 3: create a function that can display the cube of a number

        MyFirstFunctionalInterface cubeOfNumber = number -> {
            System.out.println(number*number*number);
        };
        cubeOfNumber.apply(9); //729

        //function4: create a function that can check if a number is evenly divisible by 5 and 3

        MyFirstFunctionalInterface divisibleBy3And5;
        divisibleBy3And5 = n -> {
            if(n%15==0){
                System.out.println(n+ " is divisible by 3 and 5");
            }else {
                System.out.println(n+ " is NOT divisible by 3 and 5");
            }
        };
        divisibleBy3And5.apply(123658940);      // 123658940 is NOT divisible by 3 and 5



    }
}
