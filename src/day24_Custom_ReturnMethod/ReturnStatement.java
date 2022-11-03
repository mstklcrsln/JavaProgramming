package day24_Custom_ReturnMethod;

public class ReturnStatement {
    public static void main(String[] args) {

        // create a method that can print the number of the day based on given number to the method

        // nameOfDay(10); invalid on the console and axits the compiler
        nameOfDay(7);//Sunday
    }
    public static void nameOfDay (int number){
        if (number<1 || number>7) {
            System.out.println("invalid");
           return;// exits nameOfDay method.  if we use return statement can be used for exiting method
            // after return stops the compiler, code finishes and compiler exits code
        }
        //if the number is valid
        if (number==1) {
            System.out.println("Monday");
        } else if (number==2) {
            System.out.println("Tuesday");
        }else if (number==3) {
            System.out.println("Wednesday");
        }else if (number==4) {
            System.out.println("Thursday");
        }else if (number==5) {
            System.out.println("Friday");
        }else if (number==6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }

    }


}
