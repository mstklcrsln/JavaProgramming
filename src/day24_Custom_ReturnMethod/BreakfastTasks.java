package day24_Custom_ReturnMethod;

public class BreakfastTasks {
    public static void main(String[] args) {
    initialsOfPerson("veli", "olgun"); //itinial = V.O.
        System.out.println("------------------");
        domain("mesut@hotmail.com"); //domain = hotmail
        System.out.println("--------------------------");
        String [] emails = {"jsh@gmail.com", "jim@yahoo.com", "elminur@hotmail.com", "mesut@yagtj.com"};
        for (String email : emails) {
            domain(email);
        }
        /*
        domain = gmail
        domain = yahoo
        domain = hotmail
        domain = yagtj
         */

        System.out.println("------------------");
        nameOfMonths(8); //Months name = Aug
        daysOfWeek(5); //day = Fri
    }
    // 1. Create a method that can display the initials of the person
        public static void initialsOfPerson (String name, String surname){
        String itinial = name.charAt(0) + "."+ surname.charAt(0)+ ".";
        itinial=itinial.toUpperCase();
            System.out.println("itinial = " + itinial);

        }

    //2. Create a method that can display the domain of the email
    public static void domain (String email){
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    //3. Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonths (int number) {
        String name= "";
        if (number>=1 && number<=12){
            name= (number==1)? "Jan" : (number==2)? "Feb": (number==3)? "Mar" : (number==4)? "Apr" : (number==5)? "May" :
                    (number==6)? "June" : (number==7)? "July" : (number==8)? "Aug": (number==9)? "Sep" : (number==10)? "Oct":
                            (number==11)? "Nov": "Dec";
        }else {
           name= "invalid";
        }
        System.out.println("Months name = " + name);
    }

    //4. Create a method that can print the name of the day based on the given number to the method

    public static void daysOfWeek (int dayNumber) {
        String day= "";
        if (dayNumber>=1 && dayNumber<=7){
            day = (dayNumber==1)? "Monday": (dayNumber==2)? "Tuesday":(dayNumber==3)? "Wednesday":(dayNumber==4)? "Thurs":(dayNumber==5)? "Fri":(dayNumber==6)? "Saturday": "Monday";
        }else {
            day= "invalid";
        }
        System.out.println("day = " + day);
    }


    //5. Create a method that can print how many days a month has
    }




