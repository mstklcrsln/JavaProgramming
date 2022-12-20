package day40_FinalKeyword;

public class FinalVariable {

    final String birthday;
    // we need to add constructor to avoid compile error or constructor already exists
      final static String name;
        // if we want to use static variable we must call it through the class
    static {
        name= "Batch EU10"; // name will be always same
        }
    public FinalVariable (String birthday){;
       this.birthday= birthday;
    }

    public static void main(String[] args) {

        //double pi= 3.14;

      //  pi= 4.14;  we can change this. Because it is changable

        final double pi =3.14;

        final String name; // we can initialize only one times and we can not use this without initialize
       // System.out.println(name); it gives compile error because we did not initialize variable

        name= "java";// after this initializion we can use
        System.out.println(name);  // java

        System.out.println("------------------");

        // we call te object
        FinalVariable obj= new FinalVariable("May 01");
        System.out.println(obj.birthday); //May 01

       //  obj.birthday= "June01"; we can not assign it because of final keyword

        System.out.println(FinalVariable.name); // we call static variable with class name ==> Batch EU10

       // FinalVariable.name= "Python"; we can not assign new value because it is final

    }
}
