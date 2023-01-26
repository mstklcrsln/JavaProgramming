package day52_Functional_Interface_Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqCharacters {
    public static void main(String[] args) {

        String str= "aabcccdeeeef";
        // we convert string to collection type

        String[] arr = str.split("");

        Map<String, Integer> result= new LinkedHashMap<>();

        for (String each : arr) {
            int freq= Collections.frequency(Arrays.asList(arr),each);
            if(freq==1){
                result.put(each,1);
            }
        }
        System.out.println(result); //{b=1, d=1, f=1}
    }
}
