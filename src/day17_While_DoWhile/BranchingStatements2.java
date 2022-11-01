package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <='E' ; i++) {
        //    System.out.println(i);              // ABCDE
            if (i== 'C') {                              // if char is C loop will stop
              // break;                                 it will stop and  //AB
                continue;                           // it will jump C and writes  ABDE
            }
            System.out.print(i);
        }
        System.out.println("-----------------------------------");

        // print all even  numbers between 1~10 (skip the odd numbers)

        for (int i = 1; i <11 ; i++) {
           //  if (i%2==0) { This is true but here is an another way
          //  System.out.print(i);  //246810
            if (i%2 !=0) { // 1,3,5,7,9 is the true of condition and we skip the odd numbers it jumps to the next iteration
               continue;
            }
            System.out.print(i);  //246810
        }
        System.out.println("-----------------------------------");

        for (int i = 1; i <11 ; i++) {
            if (i%2==0){ // we skip the even numbers
                continue;
        }
            System.out.print(i); // 13579
}}}
