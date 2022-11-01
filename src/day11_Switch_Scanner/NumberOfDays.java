package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        int year =2001;
        int number = 2;

        if (number>=1 && number<=12){ // number1~12

            switch (number){
                case 2:
                    if (year%4==0) {                    // using ternary: (year%4==0)? "29 days" : "28 days"
                        System.out.println("29 days");
                    } else{
                        System.out.println("28 days");
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("30 days");
                default:        //1, 3, 5, 7, 8, 10, 12
                    System.out.println("31 days");
                    break;
            }

        } else {
            System.out.println("Invalid Number");
        }


    }
}
/*
28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12
 */