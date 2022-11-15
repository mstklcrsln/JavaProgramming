package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employes = new ArrayList<>();
        employes.addAll(Arrays.asList("Ali","David", "Ahmed", "Jimmy", "Daniel" ,"Aaron", "Ahmed", "David", "Mesut"));
        // we want to keep Ahmet and David

        employes.retainAll(Arrays.asList("Ahmed", "David")); // remove all elements except Ahmed and David

        System.out.println(employes); //[David, Ahmed, Ahmed, David]

        System.out.println("----------------------");

        String[] names = {"Hasan","Mary", "Monica" ,"Musti", "Sumeyra",  "Mesut", "Beril"};
        // we want to remove the names which starts uppercase M

        // we need to convert array to the ArrayList, then we will remove the elements
        ArrayList<String > list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p-> p.charAt(0)=='M');
        System.out.println(list); //[Hasan, Sumeyra, Beril]

        // to convert he Arraylist back to the Array
        names=  list.toArray(new String [0]);
        System.out.println(Arrays.toString(names)); //[Hasan, Sumeyra, Beril]
    }
}
