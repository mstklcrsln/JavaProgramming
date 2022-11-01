package day10_NestedIf_Ternaries;

public class GradeReport2 {
    public static void main(String[] args) {
        int s=55;


            // using ternaries only
      String result=   (s <= 100 && s >= 0)?  (s>=90)? "Excellent" : (s>=80)? "Great" : (s>=70)? "Good" :(s>=60)? "Passed" : "Failed"  : "Invalid Score" ;

        System.out.println(result);

        System.out.println("-----------------------------------------------------");

        String result2 = "";
       if  (s <= 100 && s >= 0) {

           result2 = (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed";

       }else {System.out.println("Invalid Score"); }

        System.out.println(result2);;



    }
}
        /*
        int n =89; // change by s

        String res

 = " "; // temporary string
        if (n <= 100 && n >= 0) {
            // there is 5 possibilities

            if (n >= 90 && n <= 100) {
                res

 = "Excellent";
            } else if (n >= 80) { // false : score <90 so no need eto write
                res

 = "Great";
            } else if (n >= 70) {// false : score <80 so no need eto write
                res

 = "Good";
            } else if (n >= 60) {// false : score <70 so no need eto write
                res

 ="Passed";
            } else {
                res

 = "Failed";
            }
        } else {
            res

 ="Wrong input";
        }
        System.out.println("----------------------------------------");
        // for the strings that 6 times we write
        // we assigne a variable to String res
        System.out.println(res
*/




