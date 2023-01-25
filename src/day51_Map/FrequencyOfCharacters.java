package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {


      String str = "bbcccaaaaa";

      String [] arr = str.split(""); // we converted String to array
            //chars //freq
        Map<String, Integer> result = new LinkedHashMap<>(); //to get the order we used linkedHashmap

        for (String eachCharsOfString : arr) {
            int freq= Collections.frequency(Arrays.asList(arr), eachCharsOfString);
            result.put(eachCharsOfString,freq);

          //  result.put(eachCharsOfString, Collections.frequency(Arrays.asList(arr), eachCharsOfString));
        }
        System.out.println(result); //{b=2, c=3, a=5}
        /*

       1-  at first we converted String to array by splitting.
       2-Array arr contains each element in the string
       3- Get each characters added into the map as key and get the frequency added into the map as the value
       4- Apply a loop to get every single element from Array arr
       5- Add the eachCharsOfString as a key into the map by using put method
       6- put method needs two argument:
            1. String key,  ===> this will be eachCharsOfString
            2. Integer value ===> this will come from Collections methods. If we convert our arr to collection we can use frequency method from collections.

      7- We call the Collections utility classand it demands two argument
      Collections.frequency(Arrays.asList(arr), eachCharsOfString)
            1. argument is Collection type ==> we call asList method
            2. argument is eachCharsOfString to find the every single element
      8- Now this map contains the freq of characters

        result.put(eachCharsOfString, Collections.frequency(Arrays.asList(arr), eachCharsOfString));
         */
    }
}

/*
2. Write a program that can return the frequency of characters
        Not: MUST use map

        Ex: str = "bbcccaaaaa"

        output:
            {b=2, c=3, a=5}
 */