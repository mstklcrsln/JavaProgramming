package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str= "Java Java Python Python";
        int frequency= 0;

        while (str.contains("Java")) {
           str=  str.replaceFirst("Java","");
            frequency++;
        }
       System.out.println(frequency); //2

        System.out.println("-------------------------------------");

        String sentence = "cat cat cat cat dog dog dog cat cat";
       // sentence= sentence.toLowerCase();  we changed all of them to lower case
                int countCat= 0;

        while (sentence.contains("cat")) {
            sentence= sentence.replaceFirst("cat", "");
            countCat+=1;
                }  System.out.println(countCat); //6



        System.out.println("-------------------------------------");
        String s= "Java Java Python Python Java Java Python Python";
        int countJava =0;
        int countPython= 0;

        while (s.contains("Java") || s.contains("Python")) {
            if ( s.contains("Java")) {
                s= s.replaceFirst("Java", "");
                countJava++;
            }
            if (s.contains("Python")) {
                s=s.replaceFirst("Python","");
                countPython++;

            }
        }
        System.out.println("countPython = " + countPython); //countPython = 4
        System.out.println("countJava = " + countJava);         //countJava = 4

    }
}
