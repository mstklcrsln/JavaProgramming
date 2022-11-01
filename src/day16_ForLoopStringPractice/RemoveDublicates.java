package day16_ForLoopStringPractice;

public class RemoveDublicates {
    public static void main(String[] args) {

        String ste= "aabbaacc";
        // we want abc
        String result = ""; // we will add the letter one times. add if that character does not contained in the result
                                    // add a one times and second (result  have contained a) so it will not add double or more times.

        for (int i = 0; i <= ste.length()-1; i++) {  // i represents all the index numbers starting from 0
        String ch= "" +ste.charAt(i);                             // represents each character of ste
                                                                                // writes  each line a a b b c c

            if (!result.contains(ch)) {  // if the character is not contained in the result
            result += ch;  // without if statement only this writes  aabbaacc
        }

    }    System.out.println(result);  //abc
} }
/*


 */
