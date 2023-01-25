package day51_Map;

import java.util.*;

public class Map_Iteration {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();
        students.put(2, "Adam");
        students.put(10, "Arthur");
        students.put(20, "Anna");
        students.put(3, "Jack");
        students.put(40, "Anna");
        students.put(50, "Mithat");
        students.put(60, "John");
        students.put(70, "Salih");
        students.put(null,null);

       // System.out.println("students.keySet() = " + students.keySet()); students.keySet() = [null, 2, 50, 3, 20, 70, 40, 10, 60]

       Set <Integer> keys = students.keySet();
        for(Integer eachkey: keys){
            System.out.println(eachkey+ " : "+ students.get(eachkey));
        }
        /*
        null : null
        2 : Adam
        50 : Mithat
        3 : Jack
        20 : Anna
        70 : Salih
        40 : Anna
        10 : Arthur
        60 : John
         */

        Map <String, Integer> students1= new HashMap<>();
        students1.put("Mesut", 101);
        students1.put("Veli", 103);
        students1.put("Ali", 105);
        students1.put("Ahme",107);
        students1.put("Alex", 109);


        //remove the students below than 155
        for (String eachKey : students1.keySet()) {
        Integer eachValue= students1.get(eachKey);
        if (eachValue<105){
            System.out.println(eachKey); //Veli             Mesut

            // if(eachValue<105){
         //   students1.remove(eachKey); //Exception in thread "main" java.util.ConcurrentModificationException
        }
            
        }


        System.out.println("-----------------------------------");


        Map <String, Integer> students2= new HashMap<>();
        students2.put("Mesut", 101);
        students2.put("Veli", 103);
        students2.put("Ali", 105);
        students2.put("Ahme",107);
        students2.put("Alex", 109);
        students2.put("Jack", 111);
        students2.put("John", 113);
        students2.put("Adam", 119);
        students2.put("Jaso", 117);

        Map<String, Integer> earlyBirds= new HashMap<>(); // score is bigger than 110
        Map<String, Integer> angryBirds= new HashMap<>(); // score is smaller than 110

        for (String key : students2.keySet()) {
            Integer value= students2.get(key);
            if(value>110){
                earlyBirds.put(key,value);
            }else {
                angryBirds.put(key,value);
            }

        }
        System.out.println("earlyBirds = " + earlyBirds); //earlyBirds = {Adam=119, Jaso=117, John=113, Jack=111}
        System.out.println("angryBirds = " + angryBirds); //angryBirds = {Ahme=107, Alex=109, Veli=103, Mesut=101, Ali=105}

        Set <String> names= students2.keySet();
        System.out.println("names = " + names); //names = [Ahme, Adam, Jaso, Alex, Veli, Mesut, John, Jack, Ali]


     //   Collection <Integer> scores= students2.values();
      //  System.out.println("scores = " + scores); //scores = [107, 119, 117, 109, 103, 101, 113, 111, 105]

        List<Integer> scores= new ArrayList<>(students2.values());
        System.out.println("scores = " + scores); //scores = [107, 119, 117, 109, 103, 101, 113, 111, 105]

        for (Integer value : students2.values()) {
            System.out.print("value = " + value); //value = 107value = 119value = 117value = 109value = 103value = 101value = 113value = 111value = 105
        }

        System.out.println();

        //find max and min from map

        int maxScore=Integer.MIN_VALUE;
        int minscore = Integer.MAX_VALUE;

        for (Integer eachScore : students2.values()) {
            if ( eachScore> maxScore){
                maxScore=eachScore;
            }
            if (eachScore<minscore){
                minscore=eachScore;
            }
        }
        System.out.println("maxScore = " + maxScore); //maxScore = 119
        System.out.println("minscore = " + minscore); //minscore = 101

        System.out.println("---------------------");
        //other approach to find max and min

        int max= Collections.max( students2.values() );
        int min = Collections.min(students2.values());
        System.out.println("min = " + min); //min = 101
        System.out.println("max = " + max); //max = 119
    }
}
