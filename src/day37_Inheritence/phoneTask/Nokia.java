package day37_Inheritence.phoneTask;

public class Nokia extends  Phone {


    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefense (){
        System.out.println("you can use "+model+ " as self defence tool");
    }






}
