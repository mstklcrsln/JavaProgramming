package day13_StringClass;

import java.sql.SQLOutput;

public class StringMethods {
    public static void main(String[] args) {

    String word = "Cydeo";
              //  index=01234
    char thirdChar = word.charAt(3); // we call 3. character

        System.out.println("thirdChar = " + thirdChar);

       /* char tenthChar = word.charAt(9);  // it will give error because  String index out of range: 9
        System.out.println("tenthChar = " + tenthChar);*/
        System.out.println("-------------------------------");

        String s1 = "Batch 25 is the best batch";

        int totalCharacters=   s1.length();
        System.out.println("totalCharacters = " + totalCharacters);

            char lastCharacter = s1.charAt(totalCharacters-1);
            // char lasrCharacter = s1.charAt( s1.length()-1);  // to find the last index number

        System.out.println("lastCharacter = " + lastCharacter);
        System.out.println("-------------------------------");

        String str = "wooden spoon";
       str=  str.toUpperCase(); // WOODEN SPOON

        System.out.println(str);

        String s= "JAVA";
        s= s.toLowerCase();
        System.out.println("s = " + s);

        // Today is a great day to learn java programming
        String sentence = "Today is a great day to learn java programming";
        sentence= sentence.toUpperCase();

        System.out.println("sentence = " + sentence);
    }
}
