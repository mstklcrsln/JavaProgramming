package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {

        String password= "Cydeo1990@";

    // 1.1 Password must be at least have 8 characters long, and should not contain space
        boolean r1= password.length()>=8 && !password.contains(" "); // this is the code that checks the first requirement

        //these are temporary value
        boolean r2= false; // has upper case
        boolean r3= false;  // has lower case
        boolean r4 =false;  // has special char
        boolean r5= false;  // has digit

       char [] chars =  password.toCharArray();// we create an array to get each character of string, we get every single characters

        // we take a for each loop for getting each element from char array

        for (char each : chars) {
        //each represents each character in the array
            if(Character.isUpperCase(each)){
                r2=true; // if any character is uppercase than we can set r2 to true
            } else if (Character.isLowerCase(each)) {
                r3=true; // if any character is lowercase than we can set r3 to true
            } else if (Character.isDigit(each)){
                r5= true; // if any character is digit than we can set r5 to true
            }
            else {
                r4=true; // if any character is not Upper, lower and digit than it means character is special,  we can set r4 to true
            }
            if (r2  && r3 &&  r4    &&  r5){ // if the first characters of the string meets the requirement we not need to check other characters, so we break the if statement
                break;
            }
        }
        boolean isStrongPassword= r1 && r2 && r3 && r4 &&r5;
        System.out.println("isStrongPassword = " + isStrongPassword); //isStrongPassword = true
    }

    //for crating a method:
    public static boolean ısStrongPassword (String password){
    boolean r1= password.length()>=8 && !password.contains(" "); // this is the code that checks the first requirement

    boolean r2= false;
    boolean r3= false;
    boolean r4 =false;
    boolean r5= false;
    char [] chars =  password.toCharArray();

        for (char each : chars) {
        if(Character.isUpperCase(each)){
            r2=true;
        } else if (Character.isLowerCase(each)) {
            r3=true;
        } else if (Character.isDigit(each)){
            r5= true;
        }
        else {
            r4=true;
        }
    }
        boolean isStrongPassword= r1 && r2 && r3 && r4 &&r5;
        return isStrongPassword;
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