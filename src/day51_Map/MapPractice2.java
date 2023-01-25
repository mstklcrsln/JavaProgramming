package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();


        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        //  1 who has the maximum and minimum salary?

        String name1= "";
        int maxSalary= Integer.MIN_VALUE;

        String name2= "";
        int minSalary= Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey= pair.getKey();
            Integer eachValue= pair.getValue();

            if(eachValue>maxSalary){
                maxSalary= eachValue;
                name1 = eachKey;
            }

            if (eachValue<minSalary){
                minSalary= eachValue;
                name2= eachKey;
            }
        }
      System.out.println("name1 = " + name1);       //name1 = Jalil
        System.out.println("minSalary = " + minSalary); //minSalary = 85000
        System.out.println("name2 = " + name2);         //name2 = Conor

        System.out.println("-----------------------------");

        //how many employees between 120K-150K

            int count= 0;

        for (Integer eachValue : map.values()) {
            if (eachValue>=120000 && eachValue<=150000){
                count++;
                //  System.out.println(count);4
            }
        }

        //display the names of employees less than 118K
        for (Map.Entry<String, Integer> pairs : map.entrySet()) {
            if(pairs.getValue()<118000){
                System.out.println(pairs.getKey());
                /*
                Antony
                Jimmy
                James
                Conor
                Josh
                 */
            }
        }
        System.out.println("-----------------------------");

        //increase all salaries by 10K if current salary is less than 120K
        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()< 120000){
                entry.setValue(entry.getValue()+10000);
            }
        }
        System.out.println(map); // increased salaries
        //{John=123000, Antony=100000, Jimmy=115000, Jalil=145000, James=110000, Conor=85000, Josh=117000, Cory=118000, Anderson=125000, Steven=135000}
        //{John=123000, Antony=110000, Jimmy=125000, Jalil=145000, James=120000, Conor=95000, Josh=127000, Cory=128000, Anderson=125000, Steven=135000}

    }
}
