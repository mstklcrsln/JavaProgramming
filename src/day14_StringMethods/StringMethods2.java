package day14_StringMethods;

public class StringMethods2 {
    public static void main(String[] args) {
        // replace method. first value and new value it changes old to new

        String str= "Java is fun, i love learning Java";

      //  str.replace("Java", "Python"); // it will not change, we need a new string
      String str2=   str.replace("Java", "Python");
        System.out.println("str1 = " + str);
      System.out.println("str2 = " + str2);

        String email= "Johnsmith@yahoo.com";
        //String email2= email.replace("yahoo", "gmail");
            email= email.replace("yahoo", "gmail");
        System.out.println("email = " + email);
       // System.out.println("email2 = " + email2);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";  // we want to remove all the Pythons from the sentence (Java Java   C# C# C++ C++    )
        sentence= sentence.replace("Python", "");
        System.out.println("sentence = " + sentence); // gives Java Java   C# C# C++ C++    there is two more  spaces here . to change it we need one more replace method.

        // sentence= sentence.replace("  ", ""); or         there are so many ways
        sentence= sentence.replace("Python", ""). replace("  ", ""); // we use two replace method
        System.out.println("sentence = " + sentence);

        String s= "Dog Dog Dog Dog Dog Dog Dog Dog  "; // compiler gives  "Dog Dog Dog Dog Dog Dog Dog Dog  "

        s=s.replace("Dog ", "Cat "); // Compiler replaces Dog to Cat        s = Cat Cat Cat Cat Cat Cat Cat Cat
        System.out.println("s = " + s);

        System.out.println("---------------------------------------");
        String s2= "C# is fun, C# is cool"; // i want to change the second C# to Java

        s2= s2.replace(" C#", " Java"); // we put a space before the C#          there are so many ways to do this
        System.out.println("s2 = " + s2);


        System.out.println("---------------------------------");

        String s3= "Java"; // we want to change all the a's to e        Java
        s3= s3.replace("a","e");                 // Jeve
        System.out.println("s3 = " + s3);

      System.out.println("-----------------------------------");

      // replaceFirst changes the first matching from the sentence left to right
      String result= "Java Java Java"; //           Java Java Java

      result= result.replaceFirst("Java", "Python");    //Python Java Java
      System.out.println("result = " + result);

      String result2= "C# is fun, C# is cool";      //C# is fun, C# is cool";
      result2= result2.replaceFirst("C#","Java" );      //Java is fun, C# is cool
      System.out.println("result2 = " + result2);

      String result3= "Java";     // Java
     // result3= result3.replaceFirst("a", "o");  //Jova
    // also to change the second a
      result3= result3. replaceFirst("va", "vo"); // to change the second a     Javo
      System.out.println("result3 = " + result3);



    }
}
