package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        //removeIf(): when we remove under a condition (if the elements we want to remove are unknown)
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        // System.out.println(list); [1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9]

       /* to remove the odd numbers,

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2!=0){
              //  list.remove(i); // removes by index. But if we use remove method in the loop we can not get the right result, because index numbers are changing in every loop
                //   System.out.println(list); [2, 4, 6, 8, 1, 2, 4, 6, 8, 1, 2, 4, 6, 8]*/

      /* lambda expression: we will use lambda expression to remove the objects they are matching with the specific condition
        p is the syntax of lambda expression p represents every single element of the list
        next we give lambda expression (  -> ) after that we give a boolean
       */
       list.removeIf(p -> p<5); //the elements smaller than 5

        System.out.println(list); //[5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 5, 6, 7, 8, 9]       all the elements less than 5

        System.out.println("------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,11,22,33,44,55,66,77,8,9,10,111));
        // i want to remove all the even numbers from the ArrayList
        list2.removeIf(each-> each%2==0);
        System.out.println(list2); //[1, 3, 5, 11, 33, 55, 77, 9, 111]

        System.out.println("--------------------");

        ArrayList<String> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList("Josh", "Shay","Shay","Jack", "Daniel",  "Selim","Selim","Selim", "Breanna","Shay","Mesut", "Wooden", "Muhtar"));

        // we will remove all elements starts with s

        list3.removeIf(start-> start.startsWith("S"));
        System.out.println("list3 = " + list3); //list3 = [Josh, Jack, Daniel, Breanna, Mesut, Wooden, Muhtar]


    }
}
