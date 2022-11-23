package day33_CustomClass_Statics;

public class IPhone {

    public static String brand= "Apple";            // static, same for all objects
    public String model;                            // Instance, changeable for all objects
    public double price;                            // Instance, changeable for all objects
    public static String operatingSystem = "IOS";   // static, same for all objects
    public String color;                            // Instance, changeable for all objects
    public String size;                             // Instance, changeable for all objects
    public static String madeIn = "China";          // static, same for all objects
    public static boolean hasBattery = true;        // static, same for all objects
    public static boolean isTouchScreen = true;     // static, same for all objects
    public static boolean hasFaceTime = true;       // static, same for all objects

   /* public static void printModeAndPrice (){
        System.out.println(model+ " " + price); it will not allow, because these are not static attributes. static methods does not accept instances

       But here it allows because OP is static
    public static void printOperatingSystem (){
        System.out.println(operatingSystem);
    }
    */
    public void method1(){
        System.out.println(model+ " " + price);
        System.out.println(operatingSystem);
    }

}
