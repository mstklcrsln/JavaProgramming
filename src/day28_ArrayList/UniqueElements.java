package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        // to find uniq elements and add them to a new ArrayList
        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C#");
        list.add("C++");
        list.add("C++");

        System.out.println(list);

        ArrayList<String > unique= new ArrayList<>();
        // to find the uniq element we need to iterate the list from first to the last element
        //we can use for each loop

        for (String each:list){
            if (list.indexOf(each) == list.lastIndexOf(each)){
                unique.add(each);
            }
        }
        System.out.println(unique); //[Python, Ruby] the unique elements of array

        System.out.println("-----------------");

        boolean r2= list.contains("C++");
        System.out.println("r2 = " + r2); //r2 = true






    }
}
