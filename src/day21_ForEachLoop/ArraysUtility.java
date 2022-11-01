package day21_ForEachLoop;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums)); //[1, 2, 3, 4, 5]
        System.out.println(nums[0]);  // this wriites the ELEMENT of the array

        System.out.println("-------------------");
        int [] scores = {95,55,100,65,85,78};

        System.out.println(Arrays.toString(scores)); //[95, 55, 100, 65, 85, 78]


        Arrays.sort(scores);  // {55....100}
        System.out.println(Arrays.toString(scores)); //[55, 65, 78, 85, 95, 100]

        System.out.println( "Min score : "+ scores[0]);                         // in the index 0 is the minimum number 55
        System.out.println("Max score :"+ scores[scores.length-1]);   // in the last index iis the maximum number 100

        System.out.println("------------------------");

        String [] names ={"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinema"};
        System.out.println(Arrays.toString(names)); //[Gunay, Anna, Zuhal, Ahmet, Maria, Sinema]

        Arrays.sort(names);  // this make strings characters to the ascii table
        System.out.println(Arrays.toString(names)); //[Ahmet, Anna, Gunay, Maria, Sinema, Zuhal]

        System.out.println("------------------------------");
        String [] words = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinema", "gunay", "anna", "zuhal", "ahmet", "maria", "sinema"};

        Arrays.sort(words);
        System.out.println(Arrays.toString(words)); //[Ahmet, Anna, Gunay, Maria, Sinema, Zuhal, ahmet, anna, gunay, maria, sinema, zuhal]
        System.out.println("------------------------------");

        int [] arr1 = {1,3,2};
        int [] arr2 = {1,2,3};

       boolean r1= Arrays.equals(arr1,arr2); // this boolean and false
        System.out.println(r1);  //false

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2= Arrays.equals(arr1,arr2); // true because we sort the numbers in order above
        System.out.println(r2);

        System.out.println("------------------------------");

        char [] ch1= {'a', 'c', 'b'};
        char [] ch2= {'b','a', 'c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println(anagram);  //true





    }
}
