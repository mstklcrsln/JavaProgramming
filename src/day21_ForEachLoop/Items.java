package day21_ForEachLoop;

import java.util.Arrays;

public class Items {
    public static void main(String[] args) {

        String [] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        //                              0           1               2               3               4               5
        double [] prices= {99.99,       150.0,      9.99,        250  ,         439.5       ,   39.99  };
        //                              0              1               2               3               4                5
        int [] itemIDs = {12345,         12346,      12347 ,  12348      ,    12349   ,    12350  }      ;
        //                              0              1               2               3               4                  5

        // we create a loop for getting elements from the indexes

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int id = itemIDs[i];
            System.out.println(item+ " - "+ id+ " - " + price);
        }
        /*
        Shoes - 12345 - 99.99
        Jacket - 12346 - 150.0
        Gloves - 12347 - 9.99
        AirPods - 12348 - 250.0
        iPad - 12349 - 439.5
        iPhone 12 case - 12350 - 39.99
         */


        
        
        /*
        itemName- itemId- price
         */


    }
}
