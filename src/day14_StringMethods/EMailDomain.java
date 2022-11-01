package day14_StringMethods;

public class EMailDomain {
    public static void main(String[] args) {

        // write a program that can give the domain of e-mail.
        // ex: cydeo.school@gmail.com
        // output ==> gmail
        String email= "cydeo.school@gmail.com";

        String domain= email.substring( email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);


        System.out.println("-----------------------------------------");
        String str1 = "Java is fun, Java is cool";

        String s1 = str1.substring(0,10+1);      //Java is fun
        System.out.println("s1 = " + s1);


        int beg = str1.lastIndexOf("J"); // J of "Java is cool"

        String s2= str1.substring(beg); // we dont need the ending
        System.out.println("s2 = " + s2); //Java is cool

        System.out.println("-----------------------------------------");
        String str2 = "Java is fun, Java is cool, I love Java";

        int beg2 = str2.indexOf(" J")+1;
        int beg3= str2.lastIndexOf(",");

        String s3= str2.substring(beg2,beg3); //Java is cool
        System.out.println("s3 = " + s3);

        // i love java

        String s4= str2.substring(str2.lastIndexOf("I")); //I love Java
        System.out.println("s4 = " + s4);







    }
}
