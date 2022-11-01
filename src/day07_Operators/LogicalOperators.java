package day07_Operators;

public class LogicalOperators {

    public static void main(String[] args) {


        String name = "Steven";
        int age= 19;
        String citizen =  "USA";

        boolean isEligible = age >= 18 && citizen == "USA";
                //                      19>= 18  "&&" "UK" == "USA"
            //                             true     &&   false  ==>goes false

        System.out.println(name+ " is eligible to vote: " + isEligible);

        System.out.println("-------------------------------------");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 60_000;

        boolean isEligible2 = creditScore >= 700 && age2 >=21 && income >= 60_000;
        System.out.println(name2+ " is eligible for loan: " + isEligible2 );

        System.out.println("-------------------------------------");
            String name3 = "Osman";
        int age3= 21;
        char gender = 'F';
                boolean isEligible3 =  age3 >= 18 && (gender == 'M' || gender =='F');
        //                                          21> 18       && (gender M)          gender F
        //                                          true                   ( false                  true) so it will go true
        //                                          true                    (true) ===> it will be true


        System.out.println(name3 + " is eligible to register: " + isEligible3);

        System.out.println("-------------------------------------");

        String name4 = "James";
        String countryOfBirth = "US";
        boolean marriedToUSCitizen = false;
        boolean isEligible4 = countryOfBirth ==  "USA"  || marriedToUSCitizen == true;
        //                                  false                                   false
        // final result is false
        // if one of them is true it will go true

        System.out.println(name4 + " is Eligible to apply for US citizenship:  " + isEligible4);

        System.out.println("-------------------------------------");

        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 100_000;
        boolean isEligible5 = gpa>= 3.5 || familyIncome <= 60000;

        System.out.println(student + " is eligible for scholarship: " + isEligible5);


        System.out.println("-------------------------------------");

        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3= !result2;
        System.out.println("result3 = " + result3);

        System.out.println("-------------------------------------");
        int score = 55;
        boolean pass = score >= 60;
        boolean failed = !pass;

        System.out.println("pass = " + pass);
        System.out.println("failed = " + failed);

        /*
        && ==> logical AND, both
        || ==> logical OR, either (herhangi biri) one of them is true then it is true
        ! ==> logical  NOT
         */





    }


}
