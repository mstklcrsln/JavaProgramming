package day28_ArrayList;

import java.util.ArrayList;

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


    }
}
