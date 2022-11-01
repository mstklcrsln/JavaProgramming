package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        // hourlyRate, weeklyHours

        int hourlyRate =  50;
        int weeklyRate = 40;
        int numberOfWeeks = 52;
      int salary = hourlyRate*weeklyRate*numberOfWeeks;
      //  System.out.println(salary); //if we put "" it will be String

        //soutv shortcut v means adding variable. i'm trying to write a variable. enter+enter

        System.out.println("hourlyRate =$" + hourlyRate);
        System.out.println("weeklyRate = $" + weeklyRate);
        System.out.println("salary = $ " + salary);




    }
}
