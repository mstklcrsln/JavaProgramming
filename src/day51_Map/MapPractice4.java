package day51_Map;

import java.util.*;

public class MapPractice4 {

    public static void main(String[] args) {
      /*  String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};
        String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String[] group9 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
        String[] group24= {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};*/


      //  Map <Integer, String [] > groups = new TreeMap<>(); // sorted order
        //groups.put(1, group1);
        // to get he value
       // System.out.println(Arrays.toString(groups.get(1))); //[Duygu, Magda, Farangez, Edison, Kerem, Farangis]

        // we make arraylist for not to use toString method in every stage
        ArrayList<String> group1 = new ArrayList<>(Arrays.asList( "Duygu","Magda","Farangez","Edison","Kerem","Farangis" ));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList( "Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat" ));
        ArrayList<String> group9 = new ArrayList<>(Arrays.asList( "Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem" ));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList( "Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas" ));
        ArrayList<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene" ));


        Map <Integer, ArrayList<String >> groups = new TreeMap<>();
       // groups.put(1, group1);
        //System.out.println(groups.get(1)); //[Duygu, Magda, Farangez, Edison, Kerem, Farangis]


                                    //KEY   VALUES
        System.out.println(groups); //{1=[Duygu, Magda, Farangez, Edison, Kerem, Farangis]}

        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(9, group9);
        groups.put(24, group24);
        groups.put(5, group5);

       /*
        System.out.println(groups); writes inserted order
        {1=[Duygu, Magda, Farangez, Edison, Kerem, Farangis],
        2=[Margie, Vesele, Iryn, Nilufar, Aziza, Nurcan, Raika, Igor, Elif, Sana, Azamat],
        5=[Nazar, Veronika, Mikael, Layla, Badmaa, Zaeir, Anna, Tamara, Eugene],
        9=[Alex, Ali, Andriy, Cassandra, Sevgul, Olha, Tito, Ozan, Serkan, Furkan, Madina, Muharrem],
        24=[Maria, Kristina, Amin, George, Layan, Amin, Yulia, George, Ayanle, Maxim, Nermin, Doughlas]}
        */

        // display the names of group 9 in seperate lines
        // groups.get(9) we get the key of group 9 and it returns arraylist
        for (String each : groups.get(9)) {
            System.out.println("each = " + each);
            /*
            each = Alex
            each = Ali
            each = Andriy
            each = Cassandra
            each = Sevgul
            each = Olha
            each = Tito
            each = Ozan
            each = Serkan
            each = Furkan
            each = Madina
            each = Muharrem
             */
        }

        // if we to print 2. and 3. students from group 2
        System.out.println(groups.get(2).get(1));

        System.out.println("------------------------------------------------");

        //to write all the students name in seperated lines

        for (ArrayList<String> eachGroups : groups.values()) {
            for (String eachName : eachGroups) {
                System.out.println(eachName);
                /*
                Duygu
                Magda
                Farangez
                Edison
                Kerem
                Farangis
                Margie
                Vesele
                Iryn
                Nilufar
                Aziza
                Nurcan
                Raika
                Igor
                Elif
                Sana
                Azamat
                Nazar
                Veronika
                Mikael
                Layla
                Badmaa
                Zaeir
                Anna
                Tamara
                Eugene
                Alex
                Ali
                Andriy
                Cassandra
                Sevgul
                Olha
                Tito
                Ozan
                Serkan
                Furkan
                Madina
                Muharrem
                Maria
                Kristina
                Amin
                George
                Layan
                Amin
                Yulia
                George
                Ayanle
                Maxim
                Nermin
                Doughlas

                 */
            }
        }

    }
}
/*
        String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};
        String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String[] group9 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
        String[] group24= {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};


    ArrayList<String> group1 = new ArrayList<>(Arrays.asList( "Duygu","Magda","Farangez","Edison","Kerem","Farangis" ));
    ArrayList<String> group2 = new ArrayList<>(Arrays.asList( "Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat" ));
    ArrayList<String> group9 = new ArrayList<>(Arrays.asList( "Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem" ));
    ArrayList<String> group24 = new ArrayList<>(Arrays.asList( "Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas" ));
    ArrayList<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene" ));

    // pair: Id & names of students

    Map<Integer, ArrayList<String>> groups = new TreeMap<>();
        groups.put(1, group1);
                groups.put(2, group2 );
                groups.put(9, group9);
                groups.put(24, group24);
                groups.put(5, group5);

                System.out.println(groups);

        for (String each : groups.get(24)) {
            System.out.println(each);
        }

                System.out.println(groups.get(2).get(1));


                System.out.println("------------------------------------------------");

                for (ArrayList<String> eachGroup : groups.values()) {
        for (String eachName : eachGroup) {
        System.out.println(eachName);
        }
        }
 */