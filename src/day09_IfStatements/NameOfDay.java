package day09_IfStatements;

public class NameOfDay {
    public static void main(String[] args) {

        int number =7;
          String day = "day";    // this is for NOT WRITE System.out.println again and again

        if (number==1) {
            day = "Monday";
          // System.out.println("Monday");
        } else if (number==2) {
           day = "Tuesday";
            // System.out.println("Tuesday");
        } else if (number==3) {
            day = "Wednesday";
          //  System.out.println("Wednesday");
        }        else if (number ==4) {
           // System.out.println("Thursday");
            day = "Thursday";
        }            else if (number==5) {
           // System.out.println("Friday");
        } else if (number ==6) {
           // System.out.println("Saturday");
            day = "Saturday";
        } else {
           // System.out.println("Sunday");
            day= "Sunday";
        }
        System.out.println("day = " + day);;

    }
}
