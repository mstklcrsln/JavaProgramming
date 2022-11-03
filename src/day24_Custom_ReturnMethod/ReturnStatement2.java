package day24_Custom_ReturnMethod;

public class ReturnStatement2 {
    public static void main(String[] args) {

        // nameOfMonths(15); invalid and exit
        nameOfMonths(5); //Months name = May
    }

    public static void nameOfMonths (int number) {


        if (number<1 || number >12) {
            System.out.println("invalid");
            return; // we use return for exiting the programme
        }
        String name= (number==1)? "Jan" : (number==2)? "Feb": (number==3)? "Mar" : (number==4)? "Apr" : (number==5)? "May" :
                    (number==6)? "June" : (number==7)? "July" : (number==8)? "Aug": (number==9)? "Sep" : (number==10)? "Oct":
                            (number==11)? "Nov": "Dec";
        System.out.println("Months name = " + name);
    }

    }

