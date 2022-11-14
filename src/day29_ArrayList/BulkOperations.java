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


        System.out.println("----------------");
        // retainAll retainAll(CollectionType): removes all the non-matching elements from the arraylist
        ArrayList<String > jobTitles = new ArrayList<>();

        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA" ));
        System.out.println(jobTitles); //[QA, SDET, Developer, QA, SDET, Scrum Master, BA, BA]

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));
        System.out.println(jobTitles); //[QA, SDET, QA, SDET]

        System.out.println("----------------");

        //containsAll(CollectionType): checks if all the elements are contained in the arraylist

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));

        boolean r1 =nums.contains(10);
        boolean r2= nums.contains(2) && nums.contains(4) && nums.contains(7);
        boolean r3= nums.containsAll(Arrays.asList(2,5,125555));

        System.out.println("r1 = " + r1); //r1 = true
        System.out.println("r2 = " + r2); //r2 = true
        System.out.println("r3 = " + r3); //r3 = false

        System.out.println("---------------------------");

        String [] names = {"josh", "Jack", "Daniel", "Shay", "Breanna"};
        // we want to add all elements into a list

      /*  ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(names)); // we convert non primitive to arraylist
        System.out.println("nameList = " + nameList); //nameList = [josh, Jack, Daniel, Shay, Breanna] *
       */
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println("nameList = " + nameList); //nameList = [josh, Jack, Daniel, Shay, Breanna]

        System.out.println("-----------------------");
        int [] arr= {1,2,3,4,5,6,7,8,9,10};
        //   ArrayList <Integer> list2= new ArrayList<>(Arrays.asList(arr)); convert method can be used by only NON PRIMITIVES
        // if it is Non primitive INTEGER array we can convert it to the ArrayList

        Integer [] arr1= {1,2,3,4,5,6,7,8,9,10};
        ArrayList <Integer> list2= new ArrayList<>(Arrays.asList(arr1));

        System.out.println("list2 = " + list2);  //list2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("--------------------");
        int [] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,47};
        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2)); // we used our  method which we create down
        System.out.println(list3); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 47]

    }
        // we create custom methods for converting int array to Arraylist
        public static ArrayList <Integer> convertArrayToArrayList (int[] array){
            ArrayList<Integer> list = new ArrayList<>();// to get all characters from array and add to the list and then return list
            // to get the every single element from the array we use for each loop
            for (int each : array) {
              list.add(each); //and then we add them to the list by using add method
            }
            return list;
        }
}
