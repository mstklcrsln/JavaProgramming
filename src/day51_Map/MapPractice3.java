package day51_Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();


        map.put("John", 145000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 145000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 145000);
        map.put("Steven", 135000);


        //display the max salaries

        int maxSalary= Integer.MIN_VALUE;

        for (Integer eachValue : map.values() ) { // we find the max salary
            if(eachValue>maxSalary){
                maxSalary= eachValue;
                //System.out.println("maxSalary = " + maxSalary); maxSalary = 145000
            }
        }

        /*to find max with collections
        int maxSalary1= Collections.max(map.values());
        */



        //we find the max salary and now we will find the keys of maxSalary=145000
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if(pair.getValue()==maxSalary){
                System.out.println(pair.getKey());
                //John
                //Jalil
                //James
                //Anderson
            }
        }


    }
}
