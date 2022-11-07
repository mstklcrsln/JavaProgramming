package day24_Custom_ReturnMethod;

public class ReturnMethodPractice4 {

    public static void main(String[] args) {

        String str = "ccccccddddddaaaaasssssbbbbbbbb";

        str = removeDuplicates(str);
        System.out.println(str); //cdasb
    }

    // create a method can remove duplicated characters from a string and returns the new value
    public static String removeDuplicates (String str){ // "aaabbcc"==> "abc"
        String result ="";
        for (int i = 0; i <str.length() ; i++) {
                char each = str.charAt(i);

                if (!result.contains("" +each)) { // does not contains the character char will be added result
                    result += each;
                }
        }
            return result;
    }

}
