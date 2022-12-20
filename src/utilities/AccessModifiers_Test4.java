package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {


        System.out.println(ProtectedAccessModifier.name2); // we can reach it now       Wooden spoon

      //  System.out.println(ProtectedAccessModifier.name1); we can not reach this name1 variable

        System.out.println(AccessModifiers_Test4.name2); //Wooden spoon
    }
}
