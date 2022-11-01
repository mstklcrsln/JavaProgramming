package day22_MultiDimensionalArrays;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);

            String [] items = new String[5];
            double [] prices = new double[5];
            double sum= 0;

            for (int i = 0; i <=5 ; i++) {
                System.out.println("Enter the " + (i+1)+ ". item");
                items [i]= scan.next();
                System.out.println("How much money is " + items [i]);
                prices [i] = scan.nextDouble();
                sum += prices [i];
            }
            for (int i = 0; i <5 ; i++) {
                System.out.println(items[i]+ "\t"+ prices [i] );
            }
            System.out.println("sum = " + sum);
        }
    }

