package day28_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>();

        // add method adding element into the arraylist
        // add(Data): adds the data after the last index of the ArrayList
        //	add(index, Data): inserts the data at the given index
        //System.out.println(numbers); []
        numbers.add(10); // index 0 autoboxing size will be increased
        numbers.add(20);// index 1
        numbers.add(30);// index 2
        numbers.add(40);// index 3
        numbers.add(50);// index 4
        System.out.println(numbers); //[10, 20, 30, 40, 50]

        // to add number to index 2 ==> add (int index, integer element)
        numbers.add(2,25);// we insert 25 to the index 2
        System.out.println(numbers); //[10, 20, 25, 30, 40, 50]

        System.out.println("-----------------");

        /*
        size method: size(): returns the total number of elements, counting how many elements in the array
         */
        System.out.println(numbers.size()); // ==>6  total numbers of elements in the array

        int lastIndex= numbers.size()-1; // last index of array
        System.out.println("lastIndex = " + lastIndex); //lastIndex = 5


      // get(index): returns the element at the given index
        int indexThree= numbers.get(3);
        System.out.println("indexThree = " + indexThree); //indexThree = 30

        System.out.println("------------------------------");
        for (int i = 0; i <numbers.size() ; i++) { // this is the for loop that can iterate the index numbers from index 0 to the last index
            System.out.print(numbers.get(i)); // 102025304050 ==>this loop is repeat the get method multiple times each time it is going to pass the diffrent index numbers from the 0 till the last index
        }

        System.out.println("-----------------------------------");
        //  set(index,  Data): replaces the element at given index with the new element. we need to provide index and the element
            ArrayList<String> list= new ArrayList<>();
            list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Ruby");
        list.add("java");

        list.set(4,"Mesut");
        System.out.println("list = " + list); //list = [Java, Python, C#, Ruby, Mesut]
        list.set(2,"C++");
        System.out.println("list = " + list); //[Java, Python, C++, Ruby, Mesut]
    }
}
