package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {

        String word = "Racecar";

        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {
           reversed += word.charAt(i);

        }

        boolean isPalindrome =word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrpme = " + isPalindrome); // isPalindrpme = true


    }
}
/*
Java ==> avaJ ==> false     not palindrome
Anna  ==> annA  ==>  true equalignore case
Level  ==>  leveL  ==>  true
Racecar ==>  racecaR
 */