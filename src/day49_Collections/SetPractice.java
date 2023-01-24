package day49_Collections;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {

        String [] arr ={"Wooden spoon", "Book", "pen", "phone", "Wooden spoon","Wooden spoon","Wooden spoon","milk",
                "egg", "coke", "paper towel","Wooden spoon","Wooden spoon","Wooden spoon"};

     /*   System.out.println(Arrays.toString(arr)); //[Wooden spoon, Book, pen, phone, Wooden spoon, Wooden spoon, Wooden spoon, milk, egg, coke, paper towel, Wooden spoon, Wooden spoon, Wooden spoon]

        Set <String> set1= new HashSet<>(Arrays.asList(arr));
        //there is no duplicate
        //order is random list

        System.out.println(set1); //[Wooden spoon, egg, milk, coke, paper towel, phone, Book, pen]

        // set to array
        arr= set1.toArray(new String[0]);
        System.out.println(Arrays.toString(arr)); //[Wooden spoon, egg, milk, coke, paper towel, phone, Book, pen]*/

        // faster way to convert
    //  arr=  new HashSet<>(Arrays.asList(arr)). toArray(new String[0]);
      //  System.out.println(Arrays.toString(arr)); //[Wooden spoon, egg, milk, coke, paper towel, phone, Book, pen]


        /* if the requirement needs the first element for the first and last element for the last
         we need to change it to linkedHAshset
        arr=  new LinkedHashSet<>(Arrays.asList(arr)). toArray(new String[0]);
        System.out.println(Arrays.toString(arr)); //[Wooden spoon, Book, pen, phone, milk, egg, coke, paper towel]*/

        // if the requirement needs the sort order
        arr=  new TreeSet <>(Arrays.asList(arr)). toArray(new String[0]);
        System.out.println(Arrays.toString(arr)); //[Book, Wooden spoon, coke, egg, milk, paper towel, pen, phone]

        System.out.println("--------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,6,5,4,7,8,9,6,3,1,4,55,22,33,66,44,1,4,5,2,5,55,2,2,1,1,4,4,5,566,622,441,525,88));
        System.out.println(list); // [1, 2, 3, 6, 5, 4, 7, 8, 9, 6, 3, 1, 4, 55, 22, 33, 66, 44, 1, 4, 5, 2, 5, 55, 2, 2, 1, 1, 4, 4, 5, 566, 622, 441, 525, 88]


        // we don't want any duplicated element
        list= new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list);  //[1, 2, 3, 6, 5, 4, 7, 8, 9, 55, 22, 33, 66, 44, 566, 622, 441, 525, 88] we delete duplicates

        // if we need sorted order
        list= new ArrayList<>(new TreeSet<>(list));
        System.out.println(list); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 33, 44, 55, 66, 88, 441, 525, 566, 622]



        System.out.println("----------------------");

        Integer[] nums = {1,2,3,4,5,11,222,33,66,55,6,7,8,9,1,2,3,4,5,6,1,2,3,5,4,6,10,1,2,3,4,5,6,7,8,9,1,10,11,11};
        //we want 5'th element after removing the duplicates

       nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]); //giving 0 is the best choice for convert
        // we create new array object
        System.out.println(Arrays.toString(nums)); //[1, 2, 3, 4, 5, 11, 222, 33, 66, 55, 6, 7, 8, 9, 10]

        System.out.println("--------------------");

        String str = "aaabbbbcccddddggggggfffff";
        //  String result= ""; //a3b4ccd5....

        String result= "";

        //   new LinkedHashSet<>(Arrays.asList(str.split(""))); we convert string to array and put them in an collection type by using arraylist method

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) { // we take each character of string and remove duplicates
        int count= Collections.frequency(Arrays.asList(str.split("")),each); //we count the char's

        result +=each+count;

        // we can do like this  result +=each+Collections.frequency(Arrays.asList(str.split("")),each);
        }
        System.out.println(result); //a3b4c3d4g6f5







    }
}
