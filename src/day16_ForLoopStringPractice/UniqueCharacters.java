package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str= "aaabccc";
        String result = "";


        for (int i = 0; i <=str.length()-1; i++) { // i= index number of strings (starting from 9
            char ch= str.charAt(i);
                if (str.indexOf(ch) == str.lastIndexOf (ch)) {  // if the first and the last index number of the character are same,
                                                                                   // then the character is unique
            result+= ch;                // we will use for loop for every character
        }

        }
        System.out.println("result = " + result); // it will write only b the first time the character occures that means the character is unique b is in only one index

    }
}
// write a program that return the unique characters from a string