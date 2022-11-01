package day10_NestedIf_Ternaries;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score= 59;

        if (score >=0 && score<=100) {          // if the score is valid then compiler goes to work
            if (score>=60) {                                // if student passed exam
                System.out.println("Passed");}
            else {                                                 // otherwise if the student failed the exam
                System.out.println("Failed");}
        }

        else {                                                     // if the score is not valid
            System.out.println("null number");
        }


        System.out.println("--------------------------------------");
            int age= 21;
            boolean hasId= false;

            if (hasId){                     // if the person has ID card
            if (age>=21) {              // if the person is elder than 21
                System.out.println("Eligible to buy alcohol");
            } else {                        //if the persın is less than 21
                System.out.println("Not eligible to buy alcohol");
            }
            } else {                        // if the person does not have an Id
                System.out.println("Need an Id Card");
            }

        System.out.println("--------------------------------------");

            int number = 9;

            if (number>=1 && number<=7) {      //if the number is valid 1~7

                if (number == 1) {
                    System.out.println("Monday");
                } else if (number == 2) {
                    System.out.println("Tuesday");
                } else if (number == 3) {
                    System.out.println("Wednesday");
                } else if (number == 4) {
                    System.out.println("Thursday");
                } else if (number == 5) {
                    System.out.println("Friday");
                } else if (number == 6) {
                    System.out.println("Saturday");
                } else {
                    System.out.println("Sunday");
                }
                } else {
                System.out.println("Wrong input");}

            }

    }
