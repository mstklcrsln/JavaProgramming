package day37_Inheritence.ScrumTask;

public class AmazonINC {

    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner po= new ProductOwner("Suhaib", 23,'M', 103, 90000, company);

        BusinessAnalyst ba = new BusinessAnalyst("Mesut", 25, 'M',105,100000,company);

        ScrumMaster sm= new ScrumMaster("Asiya", 27, 'F', 107,105000,company);

        Tester tester1= new Tester("Veli", 29, 'M',"QA", 111,85000,company);
        Tester tester2= new Tester("Ali", 31, 'M',"QE", 113,95000,company);
        Tester tester3= new Tester("Fatma", 23, 'F',"SDET", 115,105000,company);
        Tester tester4= new Tester("Zülal", 25, 'F',"Tester", 117,115000,company);

        Tester [] testers = {tester1,tester2,tester3,tester4};

        Developer developer = new Developer("Mustafa", 42,'M', "Java developer", 121,140000,company);

        ScrumTeam sc= new ScrumTeam(po,ba,sm);
        //System.out.println(sc);  ScrumTeam{PO=Suhaib, BA=Mesut, SM=Asiya, number of testers=0, number of developers=0}

        sc.addDeveloper(developer);
        //System.out.println(sc); ScrumTeam{PO=Suhaib, BA=Mesut, SM=Asiya, number of testers=0, number of developers=1}

        sc.addTesters(testers);
        // System.out.println(sc); ScrumTeam{PO=Suhaib, BA=Mesut, SM=Asiya, number of testers=4, number of developers=1}

        for (Tester tester : sc.testers) { // to get each testers
            System.out.println(tester);
        }
        /*
        Employee{ name='Veli', age=29, gender=M, ID=111, jobTitle='QA', salary=85000.0, companyName='Amazon Inc'}
        Employee{ name='Ali', age=31, gender=M, ID=113, jobTitle='QE', salary=95000.0, companyName='Amazon Inc'}
        Employee{ name='Fatma', age=23, gender=F, ID=115, jobTitle='SDET', salary=105000.0, companyName='Amazon Inc'}
        Employee{ name='Zülal', age=25, gender=F, ID=117, jobTitle='Tester', salary=115000.0, companyName='Amazon Inc'}

         */
        for (Tester tester : sc.testers) { // to get each testers names only
            System.out.print(tester.name+ " "); //Veli Ali Fatma Zülal
        }
        for (Tester tester : sc.testers) { // to get each testers names and salary
            System.out.println(tester.name+ " : " + tester.salary);
            /*
            Veli : 85000.0
            Ali : 95000.0
            Fatma : 105000.0
            Zülal : 115000.0
             */
        }
    }
}
