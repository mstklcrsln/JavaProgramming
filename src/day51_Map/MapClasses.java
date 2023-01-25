package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2, "Adam");
        //  System.out.println("hashMap = " + hashMap);  hashMap = {2=Adam}
        hashMap.put(10, "Arthur");
        hashMap.put(20, "Anna");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Anna");
        hashMap.put(null,null); //hashMap = {null=null, 2=Adam, 3=Jack, 20=Anna, 40=Anna, 10=Arthur}
        System.out.println("hashMap = " + hashMap); //hashMap = {2=Adam, 3=Jack, 20=Anna, 40=Anna, 10=Arthur}
        // in the hashmap order is RANDOM
        //keys can not be dublicated, values can be more than one

       //if we give same key last one will remove. we put key 40 to Osman and Anna gone
        hashMap.put(40, "Osman");
        System.out.println("hashMap = " + hashMap); //        hashMap = {2=Adam, 3=Jack, 20=Anna, 40=Osman, 10=Arthur}

        System.out.println("-----------------------------------------------");

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(2, "Adam");
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "Anna");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Anna");
        linkedHashMap.put(50, "Mithat");
        linkedHashMap.put(60, "John");
        linkedHashMap.put(70, "Salih");
        linkedHashMap.put(null,null); //linkedHashMap = {2=Adam, 10=Arthur, 20=Anna, 3=Jack, 40=Anna, 50=Mithat, 60=John, 70=Salih, null=null}

        System.out.println("linkedHashMap = " + linkedHashMap); //linkedHashMap = {2=Adam, 10=Arthur, 20=Anna, 3=Jack, 40=Anna, 50=Mithat, 60=John, 70=Salih}
        // linkedHashmap is in insert order

        System.out.println("-----------------------------------------------");
        //sorted order by the key

        Map<Integer, String> treeMap = new TreeMap<>(); // key cannot be null or duplicated
        treeMap.put(2, "Adam");
        treeMap.put(10, "Arthur");
        treeMap.put(20, "Anna");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Anna");
        treeMap.put(50, "Mithat");
        treeMap.put(60, "John");
        treeMap.put(70, "Salih");
        // we CANNOT store null value in treeMap
        System.out.println("treeMap = " + treeMap); //treeMap = {2=Adam, 3=Jack, 10=Arthur, 20=Anna, 40=Anna, 50=Mithat, 60=John, 70=Salih}
        

        System.out.println("-----------------------------------------------");
        Map<Integer, String> hashTable = new Hashtable<>();

        hashTable.put(2, "Adam");
        hashTable.put(10, "Arthur");
        hashTable.put(20, "Anna");
        hashTable.put(3, "Jack");
        hashTable.put(40, "Anna");
        hashTable.put(50, "Mithat");
        hashTable.put(60, "John");
        hashTable.put(70, "Salih");
        System.out.println("hashTable = " + hashTable); //hashTable = {10=Arthur, 20=Anna, 40=Anna, 50=Mithat, 60=John, 70=Salih, 3=Jack, 2=Adam}

        //we CANNOT store null value in hashtable
        //it is synchronized

    }


    
}
