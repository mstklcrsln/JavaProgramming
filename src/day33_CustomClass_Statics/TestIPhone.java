package day33_CustomClass_Statics;

public class TestIPhone {

    public static void main(String[] args) {

        IPhone iphone1= new IPhone();

        System.out.println(IPhone.operatingSystem);     //IOS
        System.out.println(IPhone.madeIn );            //China
        System.out.println(IPhone.brand);             //Apple

        iphone1.method1();      //null 0.0   IOS



    }

}
