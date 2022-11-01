package day21_ForEachLoop;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        String [] words = {"Elif", "Sinem", "Gunay","Sinem","Cihad", "David",  "David","Elif", "James", "James", "Aaron", "Daniel" ,"Daniel" , "Gunay"};

        for (String each : words) { // each: elements in the string
            int count =0;
            for (String elements : words) { // every SINGLE element inthe array
                if (elements.equals(each)) {
                    count++;
                }
            }
            if (count==1){
            System.out.println(each); //Cihad
                                                        //  Aaron

            }
        }
       }
}
