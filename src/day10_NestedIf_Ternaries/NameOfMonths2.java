package day10_NestedIf_Ternaries;

public class NameOfMonths2 {
    public static void main(String[] args) {

        int n =8;
       /* paranthesis are OPTIONAL

        String result  =  n == 1? "Jan" :n == 2? "Feb" : n == 3? "Mar"  :n == 4?  "Apl" :n == 5? "May" :n == 6? "June" :
     n == 7? "July"  :n == 8? "Aug" :n == 9? "Sept" :n == 10? "Oct" :n == 11) "Nov" : "Dec";
         */

        String result  =  (n == 1)? "Jan" :(n == 2)? "Feb" : (n == 3)? "Mar"  :(n == 4)?  "Apl" : (n == 5)? "May" : (n == 6)? "June" :
                (n == 7)? "July"  : (n == 8)? "Aug" : (n == 9)? "Sept" : (n == 10)? "Oct" : (n == 11)? "Nov" : "Dec";

        System.out.println("result = " + result);


/*
        if (number == 1) {
            result = "October";
        } else if (number == 2) {
            result = "February";
        } else if (number == 3) {
            result = "March";
        } else if (number == 4) {
            result = "April";
        } else if (number == 5) {
            result = "May";
        } else if (number == 6) {
            result = "June";
        } else if (number == 7) {
            result = "July";
        } else if (number == 8) {
            result = "August";
        } else if (number == 9) {
            result = "September";
        } else if (number == 10) {
            result = "October";
        } else if (number == 11) {
            result = "November";
        } else {
            result = "December";
        }*/

    }

}
