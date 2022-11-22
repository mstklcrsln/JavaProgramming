package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        // 3 testers
        Tester tester1 = new Tester("Layan",11,"QA", 110000);
        Tester tester2 = new Tester("Ali",43,"SDET", 142000);
        Tester tester3 = new Tester("Alex",44,"SE", 135000);
        Tester tester4 = new Tester("Lala",23,"SDET", 115000);

        Tester [] testers = { tester2,tester3, tester4};

        // 4 developers
        Developer developer1 = new Developer("Ravza", 99,"Java Developer",159000);
        Developer developer2 = new Developer("Mesut", 97,"Java Master",149000);
        Developer developer3 = new Developer("Zeynep", 95,"Software Developer",139000);
        Developer developer4 = new Developer("Sevval", 93,"Senior Developer",129000);

        Developer [] developers = {developer2,developer3,developer4};
        // 1 ScrumTeam objects
        ScrumTeam scrum = new ScrumTeam("Nigara","Huseyin", "Neira", 14);
     //  System.out.println(scrum); //ScrumTeam{PO='Nigara', BA='Huseyin', SM='Neira', total numbers of testers :0, total numbers of testers :0, daysOfSprint=14}

        // we add one developer and one tester
            scrum.addTester(tester1);
            scrum.addDeveloper(developer1);
      //  System.out.println(scrum); ScrumTeam{PO='Nigara', BA='Huseyin', SM='Neira', total numbers of testers :1, total numbers of testers :1, daysOfSprint=14}

        // to add array into the arraylist
        scrum.addTesters(testers);
      //  System.out.println(scrum); ScrumTeam{PO='Nigara', BA='Huseyin', SM='Neira', total numbers of testers :4, total numbers of testers :1, daysOfSprint=14}

        // to add array into the arraylist
        scrum.addDevelopers(developers);
       // System.out.println(scrum); ScrumTeam{PO='Nigara', BA='Huseyin', SM='Neira', total numbers of testers :4, total numbers of testers :4, daysOfSprint=14}


        System.out.println("---------------------------");

        // for writing every single testers
        for (Tester eachTester: scrum.testersList){
            System.out.println(eachTester.name + " : "+ eachTester.salary);
        }
        /*
        Layan : 110000.0
        Ali : 142000.0
        Alex : 135000.0
        Lala : 115000.0
         */

        System.out.println("---------------------------");

        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
        }
        /*
        Ravza : 159000.0
        Mesut : 149000.0
        Zeynep : 139000.0
        Sevval : 129000.0
         */
        System.out.println("---------------------------");

        // we remove the tester who has ID 23 and after that we have 3 tester
        scrum.removeTester(23);
       scrum.removeDeveloper(93);
        System.out.println(scrum); //ScrumTeam{PO='Nigara', BA='Huseyin', SM='Neira', total numbers of testers :3, total numbers of testers :3, daysOfSprint=14}

    }
}

/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */