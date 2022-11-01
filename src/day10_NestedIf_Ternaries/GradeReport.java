package day10_NestedIf_Ternaries;

public class GradeReport {
    public static void main(String[] args) {
        int note =89;
        String result = " "; // temporary string
        if (note <= 100 && note >= 0) {
            // there is 5 possibilities

            if (note >= 90 && note <= 100) {
               result = "Excellent";
            } else if (note >= 80) { // false : score <90 so no need eto write
                result = "Great";
            } else if (note >= 70) {// false : score <80 so no need eto write
                result = "Good";
            } else if (note >= 60) {// false : score <70 so no need eto write
                result ="Passed";
            } else {
                result = "Failed";
            }
        } else {
            result ="Wrong input";
        }
        System.out.println("----------------------------------------");
        // for the strings that 6 times we write
            // we assigne a variable to String result

        System.out.println(result);




    }
}

