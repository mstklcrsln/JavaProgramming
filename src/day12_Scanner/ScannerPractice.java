package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a number between 1 to 7");
        //       scan.nextInt(); buradaki komutla userdan bilgi istiyoruz
        //   new Scanner(System.in).nextInt();  this is NOT the best way

        // aşağıda User'in girdiği bilgiyi bir variableye atıyoruz.
        int num = scan.nextInt();
        // print the result after user input

        String result = ""; // temporary value

        if (num>=1 && num<=7){ // we have 7 possible outputs
          result=  (num==1)? "Monday"  :(num==2)?"Tuesday"  :(num==3)?"Wednesday" :(num==4)? "Thursday" :(num==5)? "Friday"
                    :(num==6)? "Saturday" : "Sunday";

        } else { result= "ınvalid number";
        }
        System.out.println("result = " + result);

        scan.close();

    }
}













