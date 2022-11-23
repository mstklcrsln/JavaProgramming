package day34_GarbaceCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static {

        System.out.println("Static Block");
    }

    public Constructor_vs_StaticBlock (){  // there is no object so this block will not execute
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");

    /*
    when we run first static block executes, it writes output
    Static Block
    Main method
     */
        new Constructor_vs_StaticBlock (); // we create objects
        new Constructor_vs_StaticBlock ();
        new Constructor_vs_StaticBlock ();
        new Constructor_vs_StaticBlock ();
        /*
        output:
        Static Block
        Main method
        Constructor
        Constructor
        Constructor
        Constructor
         */
}
}