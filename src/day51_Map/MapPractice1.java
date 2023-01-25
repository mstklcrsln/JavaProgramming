package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();

        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        //  1. Update the "M" to Male and "F" to Female
    /*
        for (String key : employeeMap.keySet()) {
            if (employeeMap.get(key).equalsIgnoreCase("m")){
                employeeMap.replace(key, "Male");
            }
            if (employeeMap.get(key).equalsIgnoreCase("f")){
                employeeMap.replace(key, "Female");
            }
        }

        System.out.println("employeeMap = " + employeeMap); //employeeMap = {Kakalina=Female, Glad=Female, Jereme=Male, Bertrando=Male, Winfred=Male, Marika=Female, Ddene=Female, Selle=Female, Orlando=Male, Brigitte=Female, Desirae=Female, Derk=Male, Ajay=Female}
        */
        // second solution

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {

           /*
             System.out.println(entry);
            Kakalina=F
            Glad=F
            Jereme=M
            Bertrando=M
            Winfred=M
            Marika=F
            Ddene=F
            Selle=F
            Orlando=M
            Brigitte=F
            Desirae=F
            Derk=M
            Ajay=F
            */

            if (entry.getValue().equals("M")){
               // entry.setValue("Male");                       //same
                employeeMap.replace(entry.getKey(), "Male");  //same
            }
            if (entry.getValue().equals("F")){
                employeeMap.replace(entry.getKey(), "Female");
            }


        }
        System.out.println("employeeMap = " + employeeMap);

        System.out.println("---------------------------");

        // display the names of all female employees

        for (Map.Entry<String, String> pair : employeeMap.entrySet()) {
           /*
            System.out.println("pair = " + pair);
            pair = Kakalina=FeMale
            pair = Glad=FeMale
            pair = Jereme=Male
            pair = Bertrando=Male
            pair = Winfred=Male
            pair = Marika=FeMale
            pair = Ddene=FeMale
            pair = Selle=FeMale
            pair = Orlando=Male
            pair = Brigitte=FeMale
            pair = Desirae=FeMale
            pair = Derk=Male
            pair = Ajay=FeMale
            */
            String eachKey= pair.getKey();
            String eachValue= pair.getValue();

            if (eachValue.equals("Female")){
              System.out.println(eachKey);
                /*
                Kakalina
                Glad
                Marika
                Ddene
                Selle
                Brigitte
                Desirae
                Ajay
                 */
            }
           if (eachValue.equals("Male")){
                System.out.println("Males + " + eachKey);
                /*
                Males + Jereme
                Males + Bertrando
                Males + Winfred
                Males + Orlando
                Males + Derk
                 */
            }
        }
    }
}




