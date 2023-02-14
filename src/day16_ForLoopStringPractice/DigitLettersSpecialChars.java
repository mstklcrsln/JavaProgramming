package day16_ForLoopStringPractice;

public class DigitLettersSpecialChars {
    public static void main(String[] args) {

        String str = "Cydeo12345School!@$%WoodenSpoon";
        // we will get
        // digits
        // letters
        // specialcharacters  from the string

        String digits= "";// for digits
        String letters = "";  // for letters
        String specialChars = "";  // for special characters

        // first we get chars from the string one by one and if its digit we add to the String digit,
        // if it is letter we add to the String letters, else we will add to specialChar

        // for getting every single character from the string
        for (int i = 0; i < str.length(); i++) {  // i= index numbers of str from 0 to last index
            char ch= str.charAt(i); // we get every single character from string
           // System.out.println(ch); // writes all the character

            if (ch >= '0' && ch<='9')  {                     // if the char is between char 0 and char 9
                digits += ch;                                        // it will add the digits to the string digit
            } else if (ch>='a' && ch<='z' || ch>='A' && ch<='Z' ) { //if the character is between a~z and A~Z
                letters += ch;

            } else {                                                    // if the character is neither letter or digit
               if (ch != ' ') { // if the special character is not a space
                   specialChars += ch;
               }
            }
        }
        System.out.println("specialChars = " + specialChars);  //specialChars = !@$%
        System.out.println("letters = " + letters);                         //letters = CydeoSchoolWoodenSpoon
        System.out.println("digits = " + digits);                           //digits = 12345
    }
}
