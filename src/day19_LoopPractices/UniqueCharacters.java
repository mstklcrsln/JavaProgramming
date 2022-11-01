package day19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";         //bdf

        for (int j = 0; j <str.length() ; j++) {  // 'A'
            char ch = str.charAt(j); // we find the frequency of one character so we use loop
            int count = 0;  // represents the frequency of char ch
            for (int i = 0; i < str.length(); i++) {  // compares the character that outer loop picked, with each character of the string

                char each = str.charAt(i); // we get each character from string
                if (ch == each) {
                    count++;
        }
            }
      /*      if (count==1) { // if the frequency is 1 than it means the character is unique
                result += ch;
*/
            if (count !=1) {  // that means not unique
                continue;

           } result+= ch;
        }
        System.out.println(result);  //bdf


    }}


/* to find freq of one character
char ch ='a'; // we find the frequency of one character so we use loop
        int count=0;  // represents the frequency of char ch
        for (int i = 0; i < str.length(); i++) {
            char each= str.charAt(i); // we get each character from string
            if (ch== each){
            count++;}
        }
 */


/*2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods
    			Ex:
        str = "aabccdeef";
        output:
          bdf


          day 16 task solution
           for (int i = 0; i <=str.length()-1; i++) { // i= index number of strings (starting from 9
            char ch= str.charAt(i);
                if (str.indexOf(ch) == str.lastIndexOf (ch)) {  // if the first and the last index number of the character are same,
                                                                                   // then the character is unique
            result+= ch;                // we will use for loop for every character
        }

        }
        System.out.println("result = " + result); // it will write only b the first time the character occures that means the character is unique b is in only one index*/
