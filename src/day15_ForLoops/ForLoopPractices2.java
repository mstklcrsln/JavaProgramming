package day15_ForLoops;

public interface ForLoopPractices2 {
    public static void main(String[] args) {

            //for (char i= 'a'; i<='z'; i++){

      for (char i= 'a'; i<= 'z'; i++){
        System.out.print(i+ " ");}

        System.out.println();

      for (char i= 'A'; i <='Z'; i++) {
          System.out.print(i+ " ");}


        System.out.println();

      for (int i =65; i<=90; i++){ //A~z
          System.out.print((char)i+ " ");}


      System.out.println();
        System.out.println("-------------");

        for (char i= 'z'; i>='a'; i--) {
            System.out.print(i+ " ");
      }


        System.out.println();


        System.out.println("--------------------");
        for (char i= 'Z'; i>='A'; i--) {
            System.out.print(i+ " ");
        }


        System.out.println();
        System.out.println("--------------------");
        for (char i= 1; i<=40000; i++) { // first 40.000 chars
            System.out.print(i+ " ");
        }



      }}

/**
 a~z
 A~Z
 Z~A
 z~a
 */