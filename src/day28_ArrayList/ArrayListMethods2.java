package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(500);
        list.add(100);

        System.out.println(list); //[100, 200, 200, 300, 400, 500, 500, 100]

      /*  int num= 1;
        list.remove (num);
        System.out.println(list); //[100, 200, 300, 400, 500, 500, 100] first 200 has removed*/


        Integer num = 200;
        //list.remove(num);
      //  System.out.println(list); //[100, 200, 300, 400, 500, 500, 100]

      boolean r=  list.remove(num);
        System.out.println(list); //[100, 200, 300, 400, 500, 500, 100]  first 200 has removed

        System.out.println("r = " + r); // true


        System.out.println("-----------------------");

        //clear(): remove all the elements of the arraylist, size will be 0

        list.clear(); // removes all objects from array
        System.out.println(list); //[]

        System.out.println("-----------------------");
        //indexOf and lastIndexOf methods

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int in1= characters.indexOf('A'); // it will give 0, the first index
        int in2= characters.lastIndexOf('A'); // it will give 5, the last index
        System.out.println(in1); //0
        System.out.println(in2);// 5


        // unique element: if the first index and last index is equal than the element is uniq


        System.out.println("------------------");
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer>list2= new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);
        //equal means same elements in same orders
        //  System.out.println(list1==list2); false
        // if we want to see that these two arraylists have the same elements
        System.out.println(list1.equals(list2)); //true

        System.out.println("-----------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        // bulk operation: collection type
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9 ));

        System.out.println(numbers); //[1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
