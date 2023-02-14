package day53_Functional_Interface;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BuıldInFunc_Interf2 {
    public static void main(String[] args) {

        // create a function if the integer array contains given int
        BiPredicate <Integer[] , Integer> contains = (a,b)->{
           boolean result= false;
            for (Integer each : a) {
                if(each==b){
                    result=true;
                    break;
                }
            }

            return result;
        };
        Integer [] arr= {1,2,3,6,5,4,7,89,1,22,336,66,55,44,77};
        boolean r1= contains.test(arr, 22);
        System.out.println("r1 = " + r1); //r1 = true

        System.out.println("---------------------------------");
        // create a function that can check if two strings are anagram

        BiPredicate <String, String> anagram= (a,b)->{
            String [] arr1= a.split("");
            String [] arr2= b.split("");

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1,arr2);
        };

        System.out.println("---------------------------------");
        // create a function to write n times a string
        BiConsumer<String , Integer> printMultiple = (s,n)->{
            for (int i = 0; i <n ; i++) {
                System.out.print(s+ " ");
            }
        };
        printMultiple.accept("Java", 5); //Java Java Java Java Java


        System.out.println("---------------------------------");
        // create a function that takes first and last names and returns formatted version of full name,
        // JAva PROGRAmming ===> Java Programming

        System.out.println("---------------------------------");



    }
}
