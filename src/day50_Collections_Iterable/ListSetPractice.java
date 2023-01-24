package day50_Collections_Iterable;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set <Integer> set = new HashSet<>();

        set.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,22,33,4,55));

       /*
       set does not allow duplicates and no index numbers
        System.out.println("set = " + set);         set = [1, 33, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22, 55]
        */

    //  Integer[] array=   set.toArray(set.toArray(new Integer[0]));

        List <Integer> list =new ArrayList<>(set);
        //  System.out.println("list = " + list); list = [1, 33, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22, 55]

        System.out.println("-----------------------------");

        //pop() ==> LIFO
        List <Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('a', 'b', 'S', 'e','R' ));
        System.out.println("chars = " + chars);


        (   (Stack) chars   ).pop();

        System.out.println("chars = " + chars);
        /*
        chars = [a, b, S, e, R]
        chars = [a, b, S, e]
         */



        //poll() ==> FIFO

        List <String> names = new LinkedList<>();
        names.addAll(Arrays.asList("Mesut", "Ali", "Veli", "Adam", "Mıhtar"));
        System.out.println("names = " + names);
        // names.poll(); ==> intallij gives us the method
        ((LinkedList<String>) names).poll();
        System.out.println("names = " + names);
        ((LinkedList<String>) names).poll();
        System.out.println("names = " + names);
        /*
        names = [Mesut, Ali, Veli, Adam, Mıhtar]
        names = [Ali, Veli, Adam, Mıhtar]
        names = [Veli, Adam, Mıhtar]
         */
    }


}
