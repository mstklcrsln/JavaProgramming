package day10_NestedIf_Ternaries;

public class FieldTrip {
    public static void main(String[] args) {
            int grade= 2;
            String location= "";
            String groupNumber = "";
            String teacher = "";



            if (grade>=1 && grade<=6) {
                if (grade==1) {
                    location= "Apple orchard";
                    groupNumber = "3";
                    teacher = "Ms. Smith";
                    /*  System.out.println("location -  Apple orchard");
                    System.out.println("  number of groups - 3");
                    System.out.println(" teacher in charge - Ms. Smith");*/
                    } else if (grade==2) {
                    location = "Zoo";
                    groupNumber ="7";
                    teacher = "Mr. Lee";
                } else if (grade==3) {
                    location= "Aquarium";
                    groupNumber = "5";
                            teacher= "Ms. Wilson";
                }else if (grade==4 ) {
                    location = "Movie theater";
                            groupNumber= "2";
                                    teacher = "Ms. Reyes";

                }else if (grade==5) {
                    location= "Museum";
                            groupNumber= "5";
                                    teacher= "Ms. Lela";
            }else {
                    location= "Six Flags";
                            groupNumber= "8";
                                    teacher= "Mr. Watt";
                }

            } else {
                System.out.println("Invalid Number");
            }

        System.out.println("location -  " + location);
        System.out.println("number of groups - " + groupNumber);
        System.out.println("teacher in charge - " + teacher);

        // with escape sequences
        //System.out.println("location -  " + location + "\n number of groups - " + groupNumber+ "\n teacher in charge - " + teacher);
    }
}
/*
Create a class called FieldTrip. Your school goes on a Field trip each year. The place you go will be based on your grade.
Given a variable gradeNumber (1-6) figure out the details of your field trip. Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt

 */
