package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2_Arrays {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};

        ArraysUtility.printEachElement(arr1);
        System.out.println("----------------");

        double[] arr2 = {1.5,2.5,3.5,4.5};
        ArraysUtility.printEachElement(arr2);

        System.out.println("----------------");

        char [] charArray ={ 'F','D','C','B','A'};
        ArraysUtility.printEachElement(charArray);

        System.out.println("----------------");

        String [] names = {"java", "wooden", "spoon", "c", "c#"};
        ArraysUtility.printEachElement(names);


        System.out.println("----------------");

        int [] n1 = {5,8,9,6,3,2,11,4,7,55};
       int max1=  ArraysUtility.max(n1);
        System.out.println("max1 = " + max1); //max1 = 55


        System.out.println("----------------");

        double [] doubleArray = {11.5,10.5,5.5,4.5};

        double max2 = ArraysUtility.max(doubleArray);
        System.out.println("max2 = " + max2); //max2 = 11.5

        System.out.println("----------------");

        int [] a1 = {1,2,3,4,5,6,7,8,9};
        boolean r1= ArraysUtility.contains(a1,5);
        System.out.println("r1 = " + r1); //r1 = true
    }



}
