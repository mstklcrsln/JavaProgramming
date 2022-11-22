package day32_Constructors;

public class Test {

    public Test (){         //A
        System.out.println("A");
    }

    public Test (int a){            //A B
        this();
        System.out.println("B");
    }

    public Test (double a ){            //A B C
        this(5 );
        System.out.println("C");
    }

    public Test (String str){            //A B C D
        this(5.5 );
        System.out.println("D");
    }

    public static void main(String[] args) {

     /*   Test test =new Test("A");
        System.out.println(test); A B C */

        new Test("Java"); // A B C D
    }

}
