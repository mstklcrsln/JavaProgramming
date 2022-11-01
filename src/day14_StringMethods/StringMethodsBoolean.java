package day14_StringMethods;

public class StringMethodsBoolean {
    public static void main(String[] args) {

       // isEmpty ==> the length of the word is 0

        String str= ""; // space is a character

        boolean r= str.isEmpty(); // boşluk koyduğumuzda blank olur ama empty olmaz it is not empty but blank
        System.out.println("r = " + r);

        //isblank  if the string is blank (boşluk)

       boolean r4= str.isBlank();
        System.out.println("---------------------------------------------");

       String s1= "CYDEO";
       String s2= "Cydeo";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); //true uppercase or lowercase does not matter

        // yes YES Yes yES YEs
        System.out.println("yEs".equalsIgnoreCase("Yes"));      //ignores upper case or lower case

        System.out.println("--------------------------------");

        String sentence = "My favorite programming languge is Java";

        boolean result= sentence.contains("Java");                   // true
        boolean result2 = sentence.contains("java");                // false because lowercase letter
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);

       boolean hasJava3=  sentence.toLowerCase().contains("java"); //we make by a new variable all of them lowercase so result will be true
        System.out.println("hasJava3 = " + hasJava3);

        boolean hasJava4 = sentence.contains("Java") || sentence.contains("java");
        System.out.println("hasJava4 = " + hasJava4);

        System.out.println("-------------------------------");

        boolean hasCSharp = sentence.contains("C#");
        System.out.println("hasCSharp = " + hasCSharp);         // false

        System.out.println("-------------------------------------------");

        String input1 = "I love Java";
        String input2= "Java";

        System.out.println(input1.equals(input2)); //false



    }
}
