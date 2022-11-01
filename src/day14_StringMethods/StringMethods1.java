package day14_StringMethods;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1= "                          batch 25    is      very        ";
        //trim kırpmak


        str1=str1.trim(); // removes the spaces at the left and the right side of the words
        System.out.println("str1 = " + str1);   //str1 = batch 25    is      very
      //  String stru= str1;
        //  System.out.println("stru = " + stru); if we create new String we can assign new value to the new string

        System.out.println("----------------------------------");

        String str2= "Cydeo School"; // we will find the index number of  char h
                                                        //starts from left
        int n1= str2.indexOf("h");          // find 8
        System.out.println("n1 = " + n1);

        int n2= str2.indexOf("o");          // for the 1. o ==>4
        System.out.println("n2 = " + n2);

        int n3= str2.indexOf("ool"); // finds the 2. o ==> finds 9
        System.out.println("n3 = " + n3);


        String str3= "Java Programming language"; // want to find the index number of third a
        int n4= str3.indexOf("a"); // gives first a ==>1

        System.out.println("n4 = " + n4);

        int n5= str3.indexOf("a "); // we put a blank after a and it gives the second a's index number ==>3
        System.out.println("n5 = " + n5);

            int n7= str3.indexOf("g");  // gives first g of the line
        System.out.println("n6 = " + n7);

        int n6= str3.indexOf("amm"); // we want to find 3. a and give some more character to find.
        System.out.println("n6 = " + n6);

        int n8= str3.lastIndexOf("g"); // we will find from right.  lastIndex method finds the last character from the ride side of string.. en son g'yi bulacak
        System.out.println("n8 = " + n8);

        System.out.println("-----------------------------------------------");
        String s= "Java Nova Cava Wawa orange";

        int firstA= s.indexOf("a");  // looking for first a ==>1
        int lastA = s.lastIndexOf("a"); // starting from right and look for a
        int secondA= s.indexOf("a "); // look for second a
        int thirdA= s.indexOf("a C") ;//  look for third  a             there is so many other options. use your creativity
       // int forthA= s.indexOf("awa W"); second way is in below
       // int forthA= s.lastIndexOf("av"); third way is in below
        int forthA = s.indexOf("Ca"); // finds index number of C
        // int forthA = s.indexOf("Ca")+ 1;         find the index number of a after C

       // int fifthA= s.lastIndexOf("va")+ 1;    second way is in below
        int fifthA= s.indexOf("a W");

        int sixthA= s.lastIndexOf("aw");
        int seventhA = s.lastIndexOf("a ");
        // int seventhA = s.indexOf("a o");

                System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("forthA = " + forthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);

    }
}
