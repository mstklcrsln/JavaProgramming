package day50_Collections_Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {

        List <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        //remove all the elements less than 4

      /*
      if we do like this it will not remove all the elements, because size is dynamic and indexes are changing in every loop
      for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)<4){
                list.remove(i);
            }
        }
        System.out.println(list);  [2, 4, 5, 2, 4, 5, 2, 4, 5]
*/
        System.out.println("-------------------------------------------------");

        // we need to use iterable methods
        List <Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

      Iterator <Integer> it = list2.iterator();

    /*  boolean r1= it.hasNext(); // it shows that we have at least 2 element in list
        System.out.println("r1 = " + r1); //true it means there is an element after the first element so we can go to iterate it

        System.out.println(it.next()); //1  this shows the first element from the list
        boolean r2= it.hasNext(); //true
        System.out.println(it.next()); //2*/

        // we'll use while loop
        while (it.hasNext()){
          if(  it.next()<4 ){
              it.remove();
          }
        }
        System.out.println("list2 = " + list2); //list2 = [4, 5, 4, 5, 4, 5],

        System.out.println("-------------------------------------------------");

        // we use for loop
        List <Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        for (Iterator<Integer> i= list3.iterator(); i.hasNext() ;){ // loop will stop own
            if (i.next()<4){
                i.remove();
            }
        }
        System.out.println("list3 = " + list3); //list3 = [4, 5, 4, 5, 4, 5]

        System.out.println("-------------------------------------------------");

        // we use lambda expression

        List <Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list4.removeIf(p->p<4); // this is the shortcut of iterator
        System.out.println("list4 = " + list4); //list4 = [4, 5, 4, 5, 4, 5]


    }
}
