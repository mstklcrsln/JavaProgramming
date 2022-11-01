package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {
         // we are looking for how many times one word occured in a string
        // "JavaJavaJava" we're looking for frequency of Java

        String str= "JavaJavaJavaJavaJavaJavaJavaJava";
        int frequency= 0;

        for (int i = 0; i < str.length()-3 ; i++) {
                            // i <=str.length()-4
           String eachSub=  str.substring(i,i+4); // it gives error about  begin 5, end 9, length 8. we added 4 each subs.  Because there is no index number of 8,9,10
                                                                        // for solve this problem we use -4 in the condition
        //  System.out.println(eachSub);    //Java    avaJ        vaJa     aJav Java    avaJ        vaJa      aJav Java    avaJ     vaJa             aJav

                if (eachSub.equals("Java")) {
                    frequency++;
                }
        }
        System.out.println(frequency); //8
    }
}
/*
2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3


           	Str = "JavaJava";

           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)

 */
