package day32_Constructors;

public class ConstructorCalls {

    public ConstructorCalls (){
        System.out.println( "Default constructor");
     }

    public ConstructorCalls (int a){
        this();
        System.out.println( "Constructor with int argument");
    }

    public ConstructorCalls (String str){
        this(9);
        System.out.println( "Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls obj1= new ConstructorCalls();
        //Default constructor

        System.out.println("---------------------");
        ConstructorCalls obj2= new ConstructorCalls(10);
        /*
        Default constructor
        Constructor with int argument
         */
        System.out.println("---------------------");
        ConstructorCalls obj3= new ConstructorCalls("Java");
        /*
        Default constructor
        Constructor with int argument
        Constructor with String argument
         */
    }

}
