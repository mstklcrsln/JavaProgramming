package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        // how many time the word "cat" occurs
        String str= "Cat Cat Dog dog  cat dog CAt ";
        int frequency= 0;
        // this te lop for finding frequency of word in a string
        for (int i = 0; i < str.length()-3 ; i++) {
            // i <=str.length()-4
            String eachSub=  str.substring(i,i+3); // it gives error about  begin 5, end 9, length 8. we added 4 each subs.  Because there is no index number of 8,9,10
            // for solve this problem we use -4 in the condition
            //  System.out.println(eachSub);    //Java    avaJ        vaJa     aJav Java    avaJ        vaJa      aJav Java    avaJ     vaJa             aJav

            if (eachSub.equalsIgnoreCase("Cat")) {  //equalıgnore type
                frequency++;
            }
        }
        System.out.println(frequency); //2 for Cat  with sensitive          if  equalıgnore it will give 4




    }
}
