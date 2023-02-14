package day53_Functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterface1 {

    public static void main(String[] args) {

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };

        boolean result1= isPalindrome.test("Civic");
        System.out.println("result1 = " + result1); //result1 = true


        Predicate <Integer> isEven = p -> p%2==0;
        System.out.println("---------------------------------");

        List <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,6,5,4,7,8,9,6,3,1,5,5,11,2,22,33,66));
        list.removeIf(isEven); // we clean even numbers
        System.out.println(list); //[1, 3, 5, 7, 9, 3, 1, 5, 5, 11, 33]

        System.out.println("---------------------------------");

        List <String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mesut", "Ali", "Veli", "Level", "Honda", "civic"));
        names.removeIf(isPalindrome);
        System.out.println(names); //[Mesut, Ali, Veli, Honda]

        System.out.println("---------------------------------");

        Consumer<String> printEach= (s) -> {
            for (int i = 0; i <s.length() ; i++) {
                System.out.println(s.charAt(i));
            }
        };
        printEach.accept("Mesut Kilicarslan");


        System.out.println("---------------------------------");

        List<Integer>list2 = new ArrayList<>(Arrays.asList(1,2,3,5,6,4,88,99,663,22,4,55,1,1,11,44,77));
        /*for (Integer each : list2) {
            if(each%2!=0){
                System.out.println(each);
            }
        }*/
        list2.forEach(p-> {if(p%2!=0) System.out.print(p+"  , ");}); //1  , 2  , 3  , 5  , 6  , 4  , 88  , 99  , 663  , 22  , 4  , 55  , 1  , 1  , 11  , 44  , 77  ,

        System.out.println("---------------------------------");

        List<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Mesut Kılıç", "Ahmet Demir", "Veli Kara", "Mustafa Karlı"));

        employees.forEach(s-> System.out.println(s.charAt(0)+ ". "+ s.charAt(s.lastIndexOf(" ")+1)));
        /*
        M. K
        A. D
        V. K
        M. K
         */

        System.out.println("---------------------------------");
        //array to list
        Function< int[] , List<Integer> > convertToList = (a) -> {
            List<Integer> result= new ArrayList<>();

            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int [] arr= {1,2,3,5,6,4,7,8,9,63,2};
       List <Integer> l= convertToList.apply(arr);
        System.out.println("l = " + l); //[1, 2, 3, 5, 6, 4, 7, 8, 9, 63, 2]

        System.out.println("---------------------------------");
        // List to array
        Function <List <Integer>, int []> convertToArray = (a) ->{
        int [] result= new int[a.size()];
            for (int i = 0; i <a.size() ; i++) {
                result [i] = a.get(i);
            }
            return result;
        };
        List <Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3,6,5,4,78,8,9,99,55));
        int [] result2= convertToArray.apply(numbers);



    }
    }
