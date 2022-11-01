package day17_While_DoWhile;

public class LoopPractices {
    public static void main(String[] args) {


        // to write 1~10
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+ " ");           //1 2 3 4 5 6 7 8 9 10
        }
        System.out.println();
        System.out.println("--------------------------------");

        int j=1;
        while (j<=10){
            //j++;  //234567891011
            System.out.print(j); // 12345678910
            j++;
        }

        System.out.println();
        System.out.println("--------------------------------");
        int k= 1;

        do {
            System.out.print(k);        // 12345678910
            k++;
        }while (k<=10);



    }
}
