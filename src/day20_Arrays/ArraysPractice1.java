package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {
        // store the elements 10,20, 50, 70

        int [] numbers ={10, 20, 50, 70};
                    // index    0   1       2   3
        System.out.println(Arrays.toString(numbers));  //[10, 20, 50, 70]

        System.out.println("------------------------------");

        // create a variable that can contain 5 score

        int [] score = new int[5];
        score [0] =10;
        score [1] =20;
        score [2] =100;
        score [3] =110;
        score [score.length-1] =150;  // score [4] =
        // sout [10, 20, 100, 110, 150]


        System.out.println(Arrays.toString(score));  //[0, 0, 0, 0, 0]

        System.out.println("--------------------------");

        String [] months = {"January", "February", "March", "April", "May", "June", "July",
                                        "August", "September", "October", "November", "December" }; // 11==> length-1


        System.out.println(months[0]);  //"January"
        System.out.println(months[1]); //"February"
        System.out.println(months[2]);  //"mr
        System.out.println(months[3]); //"pr
        System.out.println(months[4]);  //my
        System.out.println(months[5]); //"july
        System.out.println(months[6]);  //"aug
        System.out.println(months[7]); //"sep
        System.out.println(months[8]);  //"oc
        System.out.println(months[9]); //"
        System.out.println(months[10]);
        System.out.println(months[11]); //"
            // January
        //February
        //March
        //April
        //May
        //June
        //July
        //August
        //September
        //October
        //November
        //December
        System.out.println("------------------------");
        for (int i = 0; i <months.length ; i++) {  // i represent the index numbers starting from 0
        //    System.out.println(i); 0,1,2,3,4,5,6,7,8,9,10,11
            System.out.println(months[i]);  }
            /*January
February
March
April
May
June
July
August
September
October
November
December*/
        System.out.println("-------------------------");
        for (int i = months.length-1; i >=0 ; i-- ) {  // i represents the index of rry strting from lst index
            System.out.println(months[i]);
            /*
            December
November
October
September
August
July
June
May
April
March
February
January

             */

        }






    }
}
