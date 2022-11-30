package day37_Inheritence.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

       IPhone iPhone1= new IPhone("12 pro","Small",2500,"Black");

       Samsung samsung1= new Samsung("J20", "Big", 2000,"Grey");

       Nokia nokia1= new Nokia("3210", "Small", 1500, "Grey");


        System.out.println("nokia1 = " + nokia1);
        System.out.println("samsung1 = " + samsung1);
        System.out.println("iPhone1 = " + iPhone1);
        /*
        nokia1 = Phone{brand='Nokia', model='3210', size='Small', price= $1500.0, color='Grey'}
        samsung1 = Phone{brand='Samsung', model='J20', size='Big', price= $2000.0, color='Grey'}
        iPhone1 = Phone{brand='Apple', model='12 pro', size='Small', price= $2500.0, color='Black'}
         */

        iPhone1.call(911);
        iPhone1.text(2365987411L);
        iPhone1.faceTime(2655446L);
        iPhone1.faceTime("aaa@gmai.com");

        /*
        Apple 12 pro is calling
        Apple is texting2365987411
        Apple 12 pro is having a fecetime with phone number 2655446
        Apple 12 pro is having a fecetime with emailaaa@gmai.com
         */

        System.out.println("--------------------------");

        samsung1.call(2656562l);
        samsung1.text(59565266l);
        samsung1.freeze();
        /*
        Samsung J20 is calling
        Samsung is texting59565266
        Samsung J20 is freezing
         */

        System.out.println("--------------------------");

        nokia1.selfDefense(); //you can use 3210 as self defence tool

        System.out.println("--------------------------");

        System.out.println(Phone.hasBattery); //true
        System.out.println(IPhone.hasBattery); //true
        System.out.println(Samsung.hasBattery); //true

    }
}
