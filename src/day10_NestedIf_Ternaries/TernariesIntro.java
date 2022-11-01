package day10_NestedIf_Ternaries;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;

        // regular if
        if (n%2==0) {
            System.out.println("Even"); // string
        } else {
            System.out.println("Odd");      // string
        }

        System.out.println("----------------------------------------");
        // Ternaries
          String result1=   (n%2==0)? "Even" : "Odd";
        System.out.println(result1);

        System.out.println("----------------------------------------");


        int age= 19;
            // regular if statement
        if (age>=21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
        System.out.println("----------------------------------------");
        // Ternaries type

      String resull2  =( (age>=21)? "Eligible" : "Not eligible");

        System.out.println(resull2);

        System.out.println("----------------------------------------");


        int number =100;

     /*   if (number>0) {
            System.out.println("Positive");
        } else if (number<0)  {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }*/

        // Ternarie
        String result3 = (number>0)? "Positive" : (number<0)? "Negative" : "Zero";
        System.out.println("result3 = " + result3);


    }
}
