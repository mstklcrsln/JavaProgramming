package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,3,3,3,4,5,5,5,5,6,7,8,9,10)); // we add multiple elements in one line

        System.out.println(list); //[1, 2, 3, 4, 5, 6, 7]

        // to remove 3,5,8
        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list); //[1, 2, 4, 6, 7, 9, 10]  it removes all elements we specify the element not index

        System.out.println("----------------");
        // retainAll retainAll(CollectionType): removes all the non-matching elements from the arraylist
        ArrayList<Integer> numbers= new ArrayList<>();

        numbers.addAll(Arrays.asList(100,200,200,300,400,400,400,400,500,600,700,400));
        System.out.println(numbers); //[100, 200, 200, 300, 400, 400, 400, 400, 500, 600, 700, 400]

        numbers.retainAll(Arrays.asList(400,200,300));// it will remove all elements except these numbers
        System.out.println(numbers); //[200, 200, 300, 400, 400, 400, 400, 400]






    }
}
