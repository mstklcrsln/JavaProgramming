package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {

        String str= "i love java, java is the best programme inı it sectore"; // we want to reverse
        // String is a sequence of characters, so we can get letters from string
        // index:01234567...  // we will get last character and aline from right to left
        String result= ""; // to contain the reverse version of str

    //  result += str.charAt(str.length()-);  // the index of last letter n  11
   /*   result += str.charAt(11); //n
        result += str.charAt(10); //o
        result += str.charAt(9); //o
        result += str.charAt(8);//p
        result += str.charAt(7); //S
        result += str.charAt(6); // space
        result += str.charAt(5); // n
        result += str.charAt(4); //e
        result += str.charAt(3); //d
        result += str.charAt(2); //o
        result += str.charAt(1); //o
        result += str.charAt(0); //w

        System.out.println("result = " + result); //noopS nedooW            this is the long way

      // we use loop*/
        for (int i = str.length()-1;  i >=0 ; i-- ) {
           result += str.charAt(i); }  // we are doing concenetation here adding ecah charaacter to result from 11 to 0
        System.out.println(result);

    }
}
