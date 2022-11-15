package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

    String [] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};
    // convert array to Arraylist
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));
        // use removeIf method for remove the 10 and bigger countries
        list.removeIf(p-> p.length()>=10);

        // convert arrayList back to Array
       countries=  list.toArray(new  String [0]);

        System.out.println(Arrays.toString(countries)); //[Japan, Korea, Turkey, Canada]  we clear the long countries
    }
}

/*
create an array of string called countries
write a programme that can remove all the countries that have length of 10 and greater than 10
 */