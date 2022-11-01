package day09_IfStatements;

public class IfElseStatement {
    public static void main(String[] args) {
      /*  // if and else only two option/ condition /possibility Not 1 or 3 only two 2
        if () { // statement A: if condition MUST BE  true
            else { // means otherwise  Statement B: if condition MUST BE False

            // yes-no, married - not married, odd- even, pass- fail, (only 2 possibility)
            }
        }*/
        // LEAP YEAR

            int year= 2000;
            boolean leapYear = year%4 ==0;

          /*
         if i use  two single if statement  this will be busy for Java compiler .
         this is 2 process and will exhausting for compiler
           if (leapYear) {
                System.out.println("leap");
                            }
            if (!leapYear) {
                System.out.println("not leap");
            }

            using one if statement is better than using two statement
            so we must do this like the below
            */

            if (leapYear) {
                System.out.println("Year " + year+ " is leap year");
            } else {
                    System.out.println("Year " + year + " is NOT leap year");
                }
            }

    }
