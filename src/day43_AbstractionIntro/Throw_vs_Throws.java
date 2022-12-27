package day43_AbstractionIntro;

import java.util.Scanner;

public class Throw_vs_Throws {

    public static void main(String[] args) {

        System.out.println("enter your score");

        int score = new Scanner(System.in).nextInt();

        if (score<0 || score>100){
            throw new RuntimeException("Invalid score: "+ score);
        }
        if (score>=90){
            System.out.println("A");
        } else if (score>=80) {
            System.out.println("B");
        }else if (score>=70) {
            System.out.println("C");
        }else if (score>=60) {
            System.out.println("D");
        }else {
            System.out.println("E");
        }
     //   method1();

    }

        public static void method1()  {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

}
