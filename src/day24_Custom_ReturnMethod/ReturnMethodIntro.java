package day24_Custom_ReturnMethod;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        // return method allows you to re-use the data by assigning new variable

        String str= "Java";
       // String str1= reverse(str); we can not do this
       String result = reverse(str); // it allws to assign the data, so it can be use-bal/reuse
        System.out.println(result); //avaJ

        // if palindrome?
        if (str.equalsIgnoreCase(result)){ //Java is NOT palindrome
            System.out.println(str + " is palindrome");
        }else {
            System.out.println(str + " is NOT palindrome");
        }

    }

    public static String reverse (String str) { // when we do this code with void, we can not use reverse anywhere other. so we use the other
        String reverse ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse +=str.charAt(i);

        }//System.out.print(reverse);
        return reverse;

    }


}
