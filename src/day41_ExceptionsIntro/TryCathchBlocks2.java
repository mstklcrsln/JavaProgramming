package day41_ExceptionsIntro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCathchBlocks2 {

    public static void main(String[] args) {


        System.out.println("hello");

        try {
            Thread.sleep(3000);
        } catch ( InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("World");

        // intelliJ writes the code below
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-----------");
        try {
            FileInputStream file = new FileInputStream(".file path");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}


