package day34_GarbaceCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("main method");
    }
            /*
            When we run static block executes
            1 ==> Static Block
            2 ==> main method
             */
    static { // runs first before anything and run once times
        System.out.println("Static Block");
    }
    static {
        System.out.println("static 2");
    }
    static {
        System.out.println("static 3");
    }
    /*
        Static Block
        static 2
        static 3
        main method
     */
}
