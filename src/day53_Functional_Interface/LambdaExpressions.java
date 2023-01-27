package day53_Functional_Interface;

public class LambdaExpressions {

    public static void main(String[] args) {
//lambda type   () -> {}
MyThird_Func_Int<String> stringReverse =  (s) -> {
    String reverse= new StringBuilder(s).reverse().toString();
    return reverse;
};
String result = stringReverse.method("Wooden spoon");
        System.out.print(result); //noops nedooW

    }
}

/*
s is presenting string provided by method
 */








