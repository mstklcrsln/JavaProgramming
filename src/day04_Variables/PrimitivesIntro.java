package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old

        /**
         *  int Age= 38;
         *
         *                 System.out.println(Age);
         */

        /**
         *  byte age=38;
         *         System.out.println(age);
         */

        // Weight: 160 pounds
        // byte weight = 160 this is out of potentiel of byte and wrong

      /*  Short Weight = 160; //160 is within the range of short
        System.out.println(Weight);*/

        // salary = 100.000
        // short salary = 100.000; this is out of short' range

        /*
        int salary = 100__000;  // int is the preferred data type fot Integer numbers

        System.out.println(salary);*/

     //   long TcKimlik = 53572669632L
      //  System.out.println(TcKimlik);

       // long TcKimlikNo = 53572669632L;
         //       System.out.println(TcKimlikNo);

        /**
         *  decimals: most used double
         *  if we use float we must put F after last number
          */

        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 =  52;

        System.out.println("ch2 = " + ch2);
        char ch3 = 65535;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        System.out.println("gender = " + gender);



        boolean isMarried = true;
        boolean isEmployeed = false;

        boolean result = 100 > 300 ;

        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";

        System.out.println(name + "\n" + city + "\n" + state + "\n" + country);

    }
    }
