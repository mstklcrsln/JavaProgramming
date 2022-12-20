package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;
public class AcceessModifiersTest_3 {

    public static void main(String[] args) {

      //  System.out.println(ProtectedAccessModifier.name1);
                // we can not call variable name1, because this variable has a default access modifier
                // and default is not visible outside the package

      //  System.out.println(ProtectedAccessModifier.name2); it gives error, can not reach the name 2
       // because AcceessModifiersTest_3 class is nott subclass of ProtectedAccessModifier


       // System.out.println(ProtectedAccessModifier.name2);
    }
}
