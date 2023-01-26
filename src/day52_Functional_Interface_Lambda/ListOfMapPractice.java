package day52_Functional_Interface_Lambda;

import java.util.*;

public class ListOfMapPractice {
    public static void main(String[] args) {

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid", "SM");
        scrumTeam1.put("Nikita", "Developer");
        scrumTeam1.put("Alina", "Developer");
        scrumTeam1.put("Mert", "PO");
        scrumTeam1.put("Lee", "SDET");

        Map<String, String> scrumTeam2 = new LinkedHashMap<>();
        scrumTeam2.put("Anton", "SDET");
        scrumTeam2.put("Muhammed", "Developer");
        scrumTeam2.put("Gulistan", "Developer");
        scrumTeam2.put("Ahmad", "PO");
        scrumTeam2.put("Nevim", "SM");
        scrumTeam2.put("Atakan", "SDET");

        Map<String, String> scrumTeam3 = new LinkedHashMap<>();
        scrumTeam3.put("YanChun", "BA");
        scrumTeam3.put("Tahir", "Developer");
        scrumTeam3.put("Urantuya", "SM");
        scrumTeam3.put("Veronica", "Developer");
        scrumTeam3.put("Alex", "Developer");
        scrumTeam3.put("Abdulaziz", "Developer");

        Map<String, String> scrumTeam4 = new LinkedHashMap<>();
        scrumTeam4.put("Alim", "PO");
        scrumTeam4.put("Kaiser", "SDET");
        scrumTeam4.put("Alinur", "SDET");
        scrumTeam4.put("Farya", "Develepor");
        scrumTeam4.put("Sherzod", "Developer");
        scrumTeam4.put("Gulsen", "SM");
        scrumTeam4.put("David", "Sdet");

        Map<String, String> scrumTeam5 = new LinkedHashMap<>();
        scrumTeam5.put("Elza", "SDET");
        scrumTeam5.put("Mehmet", "Developer");
        scrumTeam5.put("Stefan", "Developer");
        scrumTeam5.put("Rishat", "PO");
        scrumTeam5.put("Ismail", "SM");
        scrumTeam5.put("Tamara", "SDET");
        scrumTeam5.put("Adnan", "QA");

        //1.1 Create a data structure that can contain all the given maps above
        List<Map<String, String>> scrumTeams = new ArrayList<>();
        scrumTeams.add(scrumTeam1);
        //  System.out.println(scrumTeams); [{Abdulhamid=SM, Nikita=Developer, Alina=Developer, Mert=PO, Lee=SDET}]
        //  System.out.println(scrumTeams.size()); 1

        scrumTeams.add(scrumTeam2);
        // scrumTeams.add(scrumTeam3);
        //scrumTeams.add(scrumTeam4);
        //scrumTeams.add(scrumTeam5);
        scrumTeams.addAll(Arrays.asList(scrumTeam3, scrumTeam4, scrumTeam5));

       /*
       System.out.println(scrumTeams);
        [{Abdulhamid=SM, Nikita=Developer, Alina=Developer, Mert=PO, Lee=SDET}, {Anton=SDET, Muhammed=Developer, Gulistan=Developer, Ahmad=PO, Nevim=SM, Atakan=SDET}, {YanChun=BA, Tahir=Developer, Urantuya=SM, Veronica=Developer, Alex=Developer, Abdulaziz=Developer}, {Alim=PO, Kaiser=SDET, Alinur=SDET, Farya=Develepor, Sherzod=Developer, Gulsen=SM, David=Sdet}, {Elza=SDET, Mehmet=Developer, Stefan=Developer, Rishat=PO, Ismail=SM, Tamara=SDET, Adnan=QA}]
         */
        System.out.println("-------------------------------");
        //print all employees
        for (Map<String, String> eachScrumTeam : scrumTeams) { //we get the scrum teams
            for (Map.Entry<String, String> entry : eachScrumTeam.entrySet()) { // we get the names and job titles
                System.out.println(entry.getKey() + " : " + entry.getValue());
            /*
            Abdulhamid : SM
            Nikita : Developer
            Alina : Developer
            Mert : PO
            Lee : SDET
            Anton : SDET
            Muhammed : Developer
            Gulistan : Developer
            Ahmad : PO
            Nevim : SM
            Atakan : SDET
            YanChun : BA
            Tahir : Developer
            Urantuya : SM
            Veronica : Developer
            Alex : Developer
            Abdulaziz : Developer
            Alim : PO
            Kaiser : SDET
            Alinur : SDET
            Farya : Develepor
            Sherzod : Developer
            Gulsen : SM
            David : Sdet
            Elza : SDET
            Mehmet : Developer
            Stefan : Developer
            Rishat : PO
            Ismail : SM
            Tamara : SDET
            Adnan : QA
            */
            }
        }
        System.out.println("-------------------------------");
        //    1.2 Print the names of all scrum masters
        //THIS IS FIRST Approach
        // for (Map<String, String> eachScrumTeam : scrumTeams) { //we get the scrum teams

        //      for (String names : eachScrumTeam.keySet()) {  // we get the names
        //        if (eachScrumTeam.get(names).equals("SM")){
        //          System.out.println(names);
                    /*
                    Abdulhamid
                    Nevim
                    Urantuya
                    Gulsen
                    Ismail
                     */
        //       }
        // }


        // SECOND APPROACH
        //we iterate the map by the pairs
        for (Map<String, String> eachScrumTeam : scrumTeams) {
            for (Map.Entry<String, String> eachpair : eachScrumTeam.entrySet()) {
                if (eachpair.getValue().equals("SM")) {
                    System.out.println(eachpair.getKey());
                        /*
                        Abdulhamid
                        Nevim
                        Urantuya
                        Gulsen
                        Ismail
                         */
                }
            }


            System.out.println("--------------------");


            //    1.3 Print the names of all Developers

            for (Map<String, String> eachScrumTeam1 : scrumTeams) {
                for (Map.Entry<String, String> eachpair : eachScrumTeam1.entrySet()) {
                    if (eachpair.getValue().equals("Developer")) {
                        System.out.println(eachpair.getKey());
                            /*
Nikita
Alina
Muhammed
Gulistan
Tahir
Veronica
Alex
Abdulaziz
Sherzod
Mehmet
Stefan
 */
                    }
                }
            }
        }
    }
}
/*
1.Given the following Maps:

    1.1 Create a data structure that can contain all the given maps above

    1.2 Print the names of all scrum masters

    1.3 Print the names of all Developers

 */

