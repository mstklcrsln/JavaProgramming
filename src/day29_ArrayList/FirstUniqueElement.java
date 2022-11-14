package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        System.out.println(list); //[1, 1, 2, 3, 3, 4, 4, 5]


        for (Integer each : list) {
            int frequency = 0; // we will store the frequency of the element in this variable
            for (Integer element : list) {
                //  if(element==1){ // if the frequency of element 1
                if (element == each) {
                    frequency++; // finds the freq of element 1
                }
            }
            if (frequency == 1) {
                System.out.println(each);
                break;// to get the first uniq element 2
            }
        }
    }
}

/*
1. Write a program that can return the first unique elements from an arraylist
			Do not use indexOf & lastIndexOf methods
 */