package day14_StringMethods;

public class StringMethods3_Substring {
    public static void main(String[] args) {
        // substring (beginning index and ending index)
        // it creates the sub string from beginning index to ending index

        String word = "Cydeo School";
                            // 012345  index numbers
        String Brand = word.substring(0, 4+1 );

        System.out.println("Brand = " + Brand);

        // String str1= word.substring(6, 12);
        String str1= word.substring(6); // if we put the first number it goes until the end of String
        System.out.println("str1 = " + str1);

        System.out.println("-------------------------------------------");

        String word2= "Java Programming Language";

        String s1 = word2.substring(0,word2.indexOf(" "));  // Java         we get  from beginning  to the end of the String includes all the characters before the space
        String s2= word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));  //Programming       we will find the first space and the last space with indexOf method,  to write the code
         String s3 = word2.substring(word2.lastIndexOf(" ")+1);  // Language we will find the last space and go on

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

    }

}
