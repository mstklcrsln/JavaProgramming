package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Today is a good day to learn Java";

       String [] word=  sentence.split(" "); // we get eah of words in sentence to an array
     //   System.out.println(Arrays.toString(word));  [Today, is, a, good, day, to, learn, Java]
        String reversed= "";

        for (int i = word.length - 1; i >= 0; i--) {
           reversed +=word[i]+ " ";
        }
        System.out.println(reversed);  //Java learn to day good a is Today
    }
}
/*
1. Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";			output:
				Java learn to day good a is Today
 */