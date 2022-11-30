package day37_Inheritence;

class A {
    public A (int a){       //if the parent class have constructors with argument we need to explicit them by super keyword
        System.out.println("A");
    }
}
class B extends A {
    public B (){
        super(9); // // if the parent class has a constructor with argument sub class MUST call the constructor manually by Super keyword we explicit using/ writing our self super keyword. compiler does not automatic put this while an argument in the parent class,


        //super         compiler gives default implicitly/ explicit if/when the parent class's method is empty
        System.out.println("B");
    }

}
public class ConstructorPractice {
    public static void main(String[] args) {
        B obj = new B();  // A B ==> because A is implicitly
    }
}
