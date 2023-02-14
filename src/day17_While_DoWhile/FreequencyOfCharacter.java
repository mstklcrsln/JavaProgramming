package day17_While_DoWhile;

public class FreequencyOfCharacter {
    public static void main(String[] args) {

                // we will get any character from any string
        String str = "AAABBBC";
        char ch ='A';
        int frequency = 0;

        // first get the each index
        for (int i = 0; i < str.length(); i++) {  // i: indexes of str
            char eachChar= str.charAt(i);           // each character of str
          //  System.out.println( eachChar);  ==> AAABBBC
            // After getting each char's index we search for how many times one character occurs and we add the number to the int.
            // loop compares all the string for looking 'A' and if matchs add 1 to the frequency
            // 'A' == 'A'
            if (ch==eachChar){ // if given char is matching with the eachChar then ch is appeared inthe string
                frequency ++;  // frequency is 3 for A, 3 for B and 1 for C
           //     frequency+=1; the same as above
            }
        }
        System.out.println(ch+ ""+ frequency); // 3 for A
    }
}
