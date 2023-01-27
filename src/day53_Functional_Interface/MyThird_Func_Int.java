    package day53_Functional_Interface;
    @FunctionalInterface
    public interface MyThird_Func_Int <T>{

        T method(T data);// this is public and abstract method


    }

    /*
    2. Create a Functional interface named MyThirdFunctionalInterface that has an abstract method
    takes one argument of any type and returns the same type

            2.1 Create a class named Test and use the custom functional interface above to create the following functions:
                    1. Create a function that takes one integer and returns the cube of the given argument
                    2. Create a function that takes a String and returns the reversed value of the given argument
     */