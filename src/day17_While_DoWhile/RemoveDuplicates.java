package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str= "AAABBBCCCAAAA";

        String result= "";

        for (int i = 0; i < str.length() ; i++) {
            String ch= "" + str.charAt(i);

            if (result.contains(ch)) {
             // break   ==>for exit
               continue; // skips the repeat characters
            }
            result += ch;

        }
        System.out.println(result); //ABC




    }
}
