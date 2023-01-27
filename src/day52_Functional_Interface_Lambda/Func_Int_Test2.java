package day52_Functional_Interface_Lambda;

public class Func_Int_Test2 {

    public static void main(String[] args) {
        
        MySecond_Func_Interface<String> printEach;
        printEach= s -> {
            for (String each : s.split("")) {
                System.out.println(each);
            }
        };
        printEach.test("Wooden Spoon");
        
        MySecond_Func_Interface<Integer> cube;
        cube= n-> System.out.println(n*n*n);
        cube.test(5); //125
    }

}
