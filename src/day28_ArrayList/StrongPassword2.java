package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

    String pass= "cLdeo1990@";

    int countUpperCase =0;
    int countLowerCase= 0;
    int countDigits= 0;
    int countSpecialChar =0;

        for (int i = 0; i <pass.length() ; i++) {// we take/get index numbers from the string by this for loop
            char each= pass.charAt(i); // to get each character from index i
        // with the for loop we get the index numbers, and than by using index numbers call the chatAt method to get each characters
            if(Character.isUpperCase(each)){
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            }else if (Character.isDigit(each)){
                countDigits++;
            } else {
                countSpecialChar++;
            }
        }
       /* System.out.println("countSpecialChar = " + countSpecialChar); //1
        System.out.println("countDigits = " + countDigits);//4
        System.out.println("countDigits = " + countLowerCase);//4
        System.out.println("countUpperCase = " + countUpperCase);//1*/

        boolean hasUpperCase = countUpperCase>0;
        boolean hasLowerCase = countLowerCase>0;
        boolean hasdigit = countDigits>0;
        boolean hasSpecialChar = countSpecialChar>0;

  /*   boolean strongPassword = pass.length()>=8 && !pass.contains(" ") && hasdigit && hasLowerCase&& hasUpperCase && hasSpecialChar;
       System.out.println("strongPassword = " + strongPassword); //strongPassword = true */
        boolean strongPassword = false;

        if (pass.length()>=8){
            if (!pass.contains(" ")) {
                if (hasUpperCase){
                    if (hasLowerCase){
                        if(hasdigit){
                            if (hasSpecialChar){
                                strongPassword=true;
                            }
                        }
                    }
                }
            }
        }
    }
}

/*
Warmup tasks:
	1.Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space
        1.2 PassWord should at least contain one upper case letter
        1.3 PassWord should at least contain one lower case letter
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain a digit
 */
