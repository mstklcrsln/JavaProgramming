package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloadingIntro {
    public static void main(String[] args) {

        int [] intArray = {5,6,0,-1,3,4};
        Arrays.sort(intArray);

        double [] doubleArray = {11.5,10.5,5.5,4.5};
        Arrays.sort(doubleArray);

        char [] charArray ={ 'F','D','C','B','A'};
        Arrays.sort(charArray);

    }
}
