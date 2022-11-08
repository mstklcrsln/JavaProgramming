package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {
        String str= "123";

     int num=   Integer.parseInt(str); //returs int value. after this line we can use the numbers in mathematics
        System.out.println("num = " + num);//num = 123
        System.out.println(num+1); //124
        System.out.println(str+1);  //1231

        /*
        What is parse () method in Java?
        The parse() Method of SimpleDateFormat class is used to parse the text from a string to produce the Date. The method parses the text starting at the index given by a start position.
         */
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


        System.out.println("----------------------");

        String s1= "true";
        boolean r1= Boolean.parseBoolean(s1);
        System.out.println("r1 = " + r1);  //r1 = true

        System.out.println("----------------------");

        String s2= "123";
        Integer x= Integer.valueOf(s2);
        int y= Integer.valueOf(s2);

        System.out.println("x = " + x);  //x = 123
        System.out.println("y = " + y);  //y = 123

        String s3= "1.5";
        Double z1 = Double.valueOf(s3);

        System.out.println("z1 = " + z1); //z1 = 1.5

        System.out.println("----------------------");

        char ch1= '0';
        boolean b1= Character.isDigit(ch1);

        char ss= 'S';
        boolean b2= Character.isLetter(ss);
            // special char
       boolean b3= ! Character.isLetterOrDigit(ss);

        System.out.println("b1 = " + b1); //b1 = true
        System.out.println("b2 = " + b2); //b2 = true
        System.out.println("b3 = " + b3); //b3 = false

        char ch2= 'F';

      boolean b4=  Character.isUpperCase(ch2);
      boolean b5= Character.isLowerCase(ch2);
        System.out.println("b4 = " + b4); //b4 = true
        System.out.println("b5 = " + b5);  //b5 = false


        System.out.println("----------------------");

        String a= "a1ggfh2gfgf5gg1fh4hg3fh4ghg4";
        int sum= 0;

        for (char each : a.toCharArray()) {
            if(Character.isDigit(each)){
                sum +=Integer.parseInt(""+ each);
            }

        }
        System.out.println("sum = " + sum); // sum = 24 sum of integers in the string
    }

}
