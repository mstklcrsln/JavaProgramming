package day23_CustomMethods;

public class CustomMethodsWithParmeters {

        public static void main(String[] args) {
            // oddOrEven(); // the method demains additional information

            oddOrEven(8);
            ageOfThePerson(1981);
            printNumbers(5,9);

        }
        // create a function that can if a number is odd or even number
        public static void oddOrEven (int number) {
            if ((number&2)==0){
                System.out.println(number + " is even number");
            } else {
                System.out.println(number + " is odd number");
            }

        }

        // create a function that can display the age of the person

        public static void ageOfThePerson (int birthYear) {
           int age= 2022-birthYear;
            System.out.println("Your age is :" + age);
        }

                                                                                                //   10     50
        //  creatte a function that can print all the numbers between X and Y
    public static void printNumbers (int x, int y){
      int numbersBetween= 0;
      if (y>x) {
          numbersBetween += (x+1) +  (y-1);
          System.out.println(numbersBetween);
      }
    }
}
