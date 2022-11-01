package day15_ForLoops;

public class Finra {
    public static void main(String[] args) {
        for (int i= 1; i<=100; i++){
            if (i%15==0){                               //15,30,45,60
                System.out.print("FINRA ");
            } else if (i%3==0) {                       // 3,6,9,12,15,.....,99
                System.out.print("FIN ");
            }else if (i%5==0) {                         //5,10,15,20......100
                System.out.print("RA ");
            }else {                                         //1,2,4,7,....98
                System.out.print(i+ " ");
            }
        }





    }
}
