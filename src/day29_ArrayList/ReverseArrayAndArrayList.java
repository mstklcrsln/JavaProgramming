package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6};
        /* we want to reverse the array {6,5,4,3,2,1}
        firstly we create a new array that have enough capacity. and we get the elements in the reversed order and assign that to the new array from index 0
         */

        int result [] = new int[array.length];

        int j=0;
        for (int i = array.length - 1; i >= 0; i--, j++) { //we get each element starting from last index
            result [j] =array[i];  // for the index number of new array we need another variable
            // so we create one more variable named j;
        }
        System.out.println(Arrays.toString(result)); //[6, 5, 4, 3, 2, 1]

        System.out.println("--------------------------");
        // second solution
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            int each= list.get(i); // we get each element from last index to index 0 and will add them to our new Arraylist reversedList
            reversedList.add(each);
        }
        System.out.println(reversedList); //[9, 8, 7, 6, 5, 4, 3, 2, 1]
    }
}
