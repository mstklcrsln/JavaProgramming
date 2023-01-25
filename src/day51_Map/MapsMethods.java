package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapsMethods {
    public static void main(String[] args) {

            //KEY    VALUE
        Map <String, Integer> students= new HashMap<>();

        students.put("Mesut", 101);
        students.put("Veli", 103);
        students.put("Ali", 105);
        students.put("Ahme",107);
        students.put("Alex", 109);

        System.out.println("students = " + students); //students = {Ahme=107, Alex=109, Veli=103, Mesut=101, Ali=105}
        System.out.println("students.size() = " + students.size()); //students.size() = 5

        //display the alex's score
        System.out.println("students.get(\"Alex\") = " + students.get("Alex")); //students.get("Alex") = 109

        //replace method changes the value
        //we provide key and new value
        System.out.println("students.replace(\"Ali\",111) = " + students.replace("Ali", 111));
        System.out.println("students = " + students); //students = {Ahme=107, Alex=109, Veli=103, Mesut=101, Ali=111}

        //remove method
        students.remove("Ahme");
        System.out.println("students = " + students); // students = {Alex=109, Veli=103, Mesut=101, Ali=111}

        //containsKey method
        System.out.println("students.containsKey(\"Mesut\") = " + students.containsKey("Mesut")); //students.containsKey("Mesut") = true


        //containsValue method
        System.out.println("students.containsValue(103) = " + students.containsValue(103)); //students.containsValue(103) = true

        System.out.println("students.isEmpty() = " + students.isEmpty()); //students.isEmpty() = false

        System.out.println("students.values() = " + students.values()); //students.values() = [109, 103, 101, 111]

        //equals method
        //compares two different maps
        //students.equals(map2);

    }
}
