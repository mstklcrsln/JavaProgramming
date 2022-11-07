package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str= "Java Programming Language";
        StringUtility.printEachElementChar(str);
/*
        J
        a
        v
        a

        P
        r
        o
        g
        r
        m
        m
        i
        n
        g

        L
        a
        n
        g
        u
        a
        g
        e
 */

        System.out.println("------------");
        String s1= "wooden spoon";
        System.out.println(StringUtility.reverse(str));
        String reverese= StringUtility.reverse(s1);
        System.out.println("reverese = " + reverese); //reverese = noops nedoow

        System.out.println("------------");

        String word = "Civic";
        boolean isPalindrome=  StringUtility.isPalindrome(word);
        System.out.println("isPalindrome = " + isPalindrome); //isPalindrome = true


        String [] names = {"Anna","Java","Python","racecar","mom","Cydeo"}; // how many palindromes in the array
        int count= 0;
        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }
        }
        System.out.println("count = " + count); //count = 3

        System.out.println("------------");

        String s2= "aaabbbccccccckkkkkkk";
       String nonDuplicate= StringUtility.removeDublicates(s2);
        System.out.println("nonDuplicate = " + nonDuplicate); //nonDuplicate = abck
    }
}
