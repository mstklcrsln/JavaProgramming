package day19_LoopPractices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str= "aabcccd";
        String result= "";

        for (int j = 0; j <str.length() ; j++) {

        char ch= str.charAt(j);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (ch==each) {
                count++;
            }
        }

        if (result.contains(""+ ch)) {
            continue;       // if the character is already in the result it will skip it
        }
        result+=ch;
        result+=count;

        }
        System.out.println(result);         //a2b1c3d1
        // System.out.println(result); //a2a2b1c3c3c3d1

        }

        }


      /*  // the below code gives me frequency of one character from a string
   char ch= str.charAt(0); //a  frequency of the first character
        // i want to find how many time the character occures in the string so we will compare first a in the every character of in the string
        //when ever it is matching i need to increase frequency
        int count= 0;       //this will show "how many times the char matches with the string"

        // we compare a's index with the each character of string so we can use for loop
        // in the for loop we iterate each indexes of the string
        // starting from index 0


        for (int i = 0; i <str.length() ; i++) {  // i is index number in the string
           char each= str.charAt(i);  //     each characters of str      we get the each of the characters and assign this          we use to get  each of the character

            // in order to find out how many times 'a' is occured in the string i need to compare 'a' with each character of the string
                // so i can create the condition
            if(ch==each) {   //if this character is matching with any character in the string then i can increase the frequency one by one
                count++;

            }

        }
        // to get the 2. 3. ... characters i need their index numbers
        String result= "";  // at the end we get a2b1c3d1 here

        // we want to repeat below code steps for the each index so         we need another loop to find the frequency of every single character we repeat the statement in another loop
        // declare a loop that can get every single character from the string

     for (int j= 0; j<str.length(); j++) { // this loop help me to get every single character from string
            char ch= str.charAt(j); // WE PUT J TO FİND EVERY SINGLE CHARACTER
            int count= 0;
            for (int i = 0; i <str.length() ; i++) { // inner loop responsibilty is find the freq of each character.         each time it is going to get new frequency
                char each=str.charAt(i);
                count++;
            } // after inner loop is ended within the outer loop we have the character and it is freq       than we can just concate them in the String result

            }
        result+=ch;
        result+=count;
        System.out.println(result);

        }}

     /*   char ch= str.charAt(0); //a  frequency of the first character
        // i want to find how many time the character occures in the string so we will compare first a in the every character of in the string
        //when ever it is matching i need to increase frequency
        int count= 0;       //this will show "how many times the char matches with the string"

        // we compare a's index with the each character of string so we can use for loop
        // in the for loop we iterate each indexes of the string
        // starting from index 0


        for (int i = 0; i <str.length() ; i++) {  // i is index number in the string
            char each = str.charAt(i);  //     each characters of str      we get the each of the characters and assign this          we use to get  each of the character

            // in order to find out how many times 'a' is occured in the string i need to compare 'a' with each character of the string
            // so i can create the condition
            if (ch == each) {   //if this character is matching with any character in the string then i can increase the frequency one by one
                count++;
            }
        }
        System.out.println(count); // it gives the frequency of 'a' ==>2
    }
}
/*
1. Write a program that can find the frequency of the characters from a string
			 Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
 */
