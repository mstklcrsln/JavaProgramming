package day29_ArrayList;

import java.util.ArrayList;

public class MaxMinAverage {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list); //[1, 2, 3, 4, 5, 6, 7, 8, 9]


        // to find maximum number
        int max = list.get(0);
        int min = list.get(0);
        int sum =0;

        for (Integer each : list) {
            if (each>max){
                max=each;
            }
            if (each<min){
                min=each;
            }
            sum +=each;

        }
        double average = (double) sum/list.size();
        System.out.println(max); //9
        System.out.println(min); //1
        System.out.println(average); //5.0
    }
}

/*
2. Write a program that can find the maximum, minimum and average number from an arrayList of integers
 */
