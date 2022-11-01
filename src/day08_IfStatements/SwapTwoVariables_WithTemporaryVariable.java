package day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {

        int a= 10;
        int b = 15;
        //------------------------------------------
        int c = b; //c is 15 now, the original value of b
        b=a; // b will be 10
        a = c; // a will be 15

        //------------------------------------------
        System.out.println("a = " + a);// after writing the code awill be 15,
        System.out.println("b = " + b); // after writing the code awill be 10;



    }
}
// write a program that can swap two variables' value by using a temporary variable
// a=15
// b= 10