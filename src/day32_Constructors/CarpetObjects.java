package day32_Constructors;

public class CarpetObjects {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(2.5,5.5,65,true);
        Carpet carpet2 = new Carpet(10.5,20.5,10,false);
        Carpet carpet3 = new Carpet(0.5,2.5,100,true);

        System.out.println(carpet1);
        System.out.println(carpet2);
        System.out.println(carpet3);
/*
        Carpet{width=2.5, length=5.5, unitPrice= $65.0, isPersian=true, totalPrice = $1093.75}
        Carpet{width=10.5, length=20.5, unitPrice= $10.0, isPersian=false, totalPrice = $2152.5}
        Carpet{width=0.5, length=2.5, unitPrice= $100.0, isPersian=true, totalPrice = $325.0}
*/




    }
}
