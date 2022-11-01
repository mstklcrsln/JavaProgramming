package day19_LoopPractices;

public class UniqueCharacterExplaining {
    public static void main(String[] args) {

        String str= "aabccdeef";
        String result ="";   // we can store the final result at the end      unique characters  bdf
        // we must find the frequency of each character we find first a is uniq or not

        /*        we find the freq of a and now find the freq of each character by using a new outer loop          */
        for (int j = 0; j <str.length() ; j++) { /* i want this loop be able to pick the charaters so that the inner loop can return the freq. this loop will access to all index numbers starting from index zero till last index  of string. This loop repeats the inner loop for every character*/
            char ch = str.charAt(j); /* we put j from a to get every single character in string

           IMPORTANT :
            what is outer loop is doing? It is picking the characters and than the inner loop is going to compare that character wits ecah character of string. Than it is matching it is going to increase count  by one.
            the outer loop gives the characters one by one to inner loop and inner loop compares each character  one by one, if it matches than count will increase by 1 and we find freq
            inner loop compares each character that outer loop picked, which each character of the string
            in the outer loop char ch is j, but in the outer loop ch each is i
            */
            /* char ch='a'; this is given to us. i want to find if this character is uniq. So firstly i need to find freq.
        how to i find the freq of one character?  This one character (a) i will compare every single characters of the string.
        so which means i ll get every single character from the string. we use 1 variable to store the 'a''s value
        how should i get every single characters from the string. By using loop
         */
            int count = 0; /*represents the freq of variable ch. We will put the freq of this char into the variable*/
            for (int i = 0; i < str.length(); i++) {                /* i is representing the index number starting from zero 0 and it should ended stirng's last index number.
        we can get every single characters by using the i as the index number we can get every single characters from str by calling charAt() method
        This loop we use only to get every single characters from the string*/
                char each = str.charAt(i); /*This is the loop that we we can get every single characters . And we want to find the freq of char a (the first char)
            after find the freq of a, we need to store it into a variable that we can use at the end. and we create String outside the loop So we create variable  int count.
             Count is zero at the first. but everytime when the character is matching with the character of the string than i need to increase the freq by one.* /

            /*the only time i need to increase the freq is  if char is matchs  the character of string so we use if statement. if ch is matching the first and second character from string that means count will be two 2 */
                if (each == ch) {  /* if ch is matching the first and second character from string that means count will be two 2 . The inner loop is also going to repeat the if statement. And how many times the statement is true that should be the freq of variable int count. so, we just count how many times this statement will be executed . so that is why in this satement we will give the ncrement*/
                    count++;
                }
                /*
            after we find the freq we need to find which char is uniq. we add uniq characters into the variable result. We put the if statement in the outer loop.
             it can't be in the inner loop, it must e after inner loop,  because inner loop returns the freq . once we finish finding the freq than we need to know it is freq or not
             */
            }
            if (count == 1) { // if the frequency is 1 than it means the character is unique
                result+=ch;  // if the character's freq is uniq we will add this to the result
            }
            /*
            the second way is finding NOT  uniq character. this is a another way. if the freq of character is not equal to 1
            if (count !=1) {
            continue;  skips the counting
            } result +=ch;
            */
        }
        System.out.println(result);  //bdf

        }}


         /*         if (count==1) { // if the frequency is 1 than it means the character is unique
                result += ch;
                     result+= ch;
          if (count !=1) {  // that means not unique
                continue;*/



        //System.out.println(count); //==>2 freq of char a. If i want to find freq of c we write  b to char ch='a';
        /*
        This is the formula loop for to find freq of one character.  İn order to find freq of all characters
        char ch='a';
         int count =0;
          for (int i = 0; i <str.length() ; i++) {
            char each= str.charAt(i);
              if (each==ch) {
                count++;
        */
   /*
    // we must find the frequency of each character
   Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods
        Ex:
        str = "aabccdeef";
        output:
        bdf
        */
