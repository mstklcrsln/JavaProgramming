package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {
        String str= "123";

     int num=   Integer.parseInt(str); //returs int value. after this line we can use the numbers in mathematics
        System.out.println("num = " + num);//num = 123
        System.out.println(num+1); //124
        System.out.println(str+1);  //1231


        String str2= "10.5";
       double num2= Double.parseDouble(str2);

        System.out.println("num2 = " + num2);  //num2 = 10.5
        System.out.println(num2+2);             //12.5

        System.out.println("----------------------");
       int max= Integer.MAX_VALUE;
       int min = Integer.MIN_VALUE;

        System.out.println("max = " + max); //max = 2147483647  max integer
        System.out.println("min = " + min); //min = -2147483648 min integer

        System.out.println("----------------------");

        long max2= Long.MAX_VALUE;
        long min3= Long.MIN_VALUE;
        System.out.println("max2 = " + max2); //max2 = 9223372036854775807
        System.out.println("min3 = " + min3); //min3 = -9223372036854775808

    }

}
