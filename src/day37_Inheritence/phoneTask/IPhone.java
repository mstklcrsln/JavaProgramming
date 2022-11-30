package day37_Inheritence.phoneTask;

public class IPhone extends Phone {

        /* we create with shortcut from intelliJ
    public IPhone(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);*/

    public IPhone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void faceTime (long phoneNumber){
        System.out.println(brand + " "+ model + " is having a fecetime with phone number " + phoneNumber);
    }

    public void faceTime (String email){
        System.out.println(brand + " "+ model + " is having a fecetime with email" + email);
    }


}
