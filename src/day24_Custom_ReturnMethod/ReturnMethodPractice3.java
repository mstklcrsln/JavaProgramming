package day24_Custom_ReturnMethod;

public class ReturnMethodPractice3 {
    public static void main(String[] args) {

        String str= "aabccdee";

        for (int i = 0; i < str.length() ; i++) {
            int frequency=  frequence(str,str.charAt(i));
            if (frequency==1){ //if the character is uniq
                System.out.println(str.charAt(i)); //b d
            }
        }



      //  System.out.println("freqOfA = " + freqOfA); freqOfA = 2 this changed
    }

    public static int frequence (String str, char ch) {
        int count =0;

        for (char each : str.toCharArray()) {
            if (each==ch){
                count++; // we find freq
            }
        }
        return count;
    }



}
