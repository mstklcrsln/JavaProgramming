package day24_Custom_ReturnMethod;

public class Return_vs_ExitMethod {
    public static void main(String[] args) {

      //  nameOfMonths(50);  with return invalid exits the only  method. main method continues to work
        nameOfMonths(50); //with System.exit (0) ==>everything in the code finishes.

    }

    public static void nameOfMonths (int number) {


        if (number<1 || number >12) {
            System.out.println("invalid");
          //  return; // we use return for exiting the programme
            System.exit(0); // exites all the code. everything in the code finishes.
        }
        String name= (number==1)? "Jan" : (number==2)? "Feb": (number==3)? "Mar" : (number==4)? "Apr" : (number==5)? "May" :
                (number==6)? "June" : (number==7)? "July" : (number==8)? "Aug": (number==9)? "Sep" : (number==10)? "Oct":
                        (number==11)? "Nov": "Dec";
        System.out.println("Months name = " + name);
    }


}
