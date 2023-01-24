package day49_Collections;

import java.util.*;

public class SetIntro {
    public static void main(String[] args) {

        Set<Integer> list = new HashSet<>();

       // list.add(1);

        list.addAll(Arrays.asList(10,300,200,40,90));       //random list
        System.out.println(list);                       // random list  [200, 40, 10, 90, 300]


        list.addAll(Arrays.asList(10,300,200,40,90));
        list.addAll(Arrays.asList(10,300,200,40,90));
        list.addAll(Arrays.asList(10,300,200,40,90));
        list.addAll(Arrays.asList(10,300,200,40,90));
        // does not apply doublicated
        System.out.println(list);       //[200, 40, 10, 90, 300]

        Set <Integer> list1 = new LinkedHashSet<>();
        Set <Integer> list3= new TreeSet<>();


        List <String> str= new Vector<>();
        List<Integer> num= new LinkedList<>();
        List <String> str1 = new Stack<>();


    }

}
