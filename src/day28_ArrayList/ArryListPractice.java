package day28_ArrayList;

import java.util.ArrayList;

public class ArryListPractice {

    public static void main(String[] args) {

        /* multiple every element by 2
        (1,2,3,4,5,6)
        {2,4,6,8,10,12}
         */
        ArrayList <Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list); //[10, 20, 30, 40, 50]

        // we need regular for loop to iterate the each indexes

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)*2);
            /*
            to get every single element from the arra we call set method. i represents index number. we use get method to get each element from index number and multiple by 2
             */
        }
        System.out.println(list); //[20, 40, 60, 80, 100]


        System.out.println("---------------------------");
        /*
        remove(int index): removes the element at the given index
	    remove(Object): removes the given object from arraylist, returns boolean
	    remove method decreases the size of array, we can pass index numbers or object
         */

        ArrayList<String> employees= new ArrayList<>();
        employees.add("Suat");
        employees.add("Wooden");
        employees.add("Mesut");
        employees.add("Muhtar");
        employees.add("Ali");
        employees.add("Mustafa");
        employees.add("Jack");

        System.out.println("employees = " + employees); //employees = [Suat, Wooden, Mesut, Muhtar, Ali, Mustafa, Jack]

        employees.remove(5); // removes by index

        System.out.println(employees); //[Suat, Wooden, Mesut, Muhtar, Ali, Jack]   Mustafa in the index 5 has removed

        employees.remove("Wooden");// removes by object
        System.out.println(employees); //[Suat, Mesut, Muhtar, Ali, Jack]   Wooden has removed

        employees.remove(0);
        System.out.println(employees);//[Mesut, Muhtar, Ali, Jack]

        employees.remove(0);
        System.out.println(employees); //[Muhtar, Ali, Jack]

        employees.remove(0);
        System.out.println(employees); //[Ali, Jack]

        employees.remove(0);
        System.out.println(employees); //[Jack]
    }
}
