package day22_MultiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseOneWordOnly {
    public static void main(String[] args) {

            String sentence = "I Love Java";

            String [] words= sentence.split(" ");
            String reversed= "";
                        //belove is not array. we get the charcters of string from last to beginning we call the eleent in the index 1 of the array. and it is String
        for (int i = words[1].length()-1; i >=0 ; i--) { //we just have to iterte the string from last
            // String (love) is in the index 1 of array. if i want too find the last index num of string write: int i = words[1].length()-1
            // by using i we re going to get each characters from the second string (love, ndex 1 of array).
               reversed +=  words[1].charAt(i); // i gives us the each of the characters in the word and add this to the string variable reversed
        }
       //  System.out.println(reversed); evoL

      //  sentence = sentence.replaceFirst(words[1], reversed); // we reversed the string which is in array index 1

        // another solution

        words [1] = reversed;

        System.out.println(Arrays.toString(words)); //[I, evoL, Java] after this we use for loop each to get every word one by one  and write the sentence one by one
        String result= "";
        for (String word : words) {
            //System.out.print(word+ " "); //I evoL Java
            result += word+ " ";
        }
        System.out.println(result); //I evoL Java




    }
}

/*
2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";
			output:
				I evoL Java
 */
