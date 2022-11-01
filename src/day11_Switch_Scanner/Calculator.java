package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 2,
                     n2 = 3.5;
        char operator = '/';

        boolean valid = operator== '+' || operator== '-' || operator == '*' || operator=='/' ;

        if (valid) {        // operators: +-*/
            switch (operator) {
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '*':
                        System.out.println(n1*n2);
                        break;
                case '/':           // or we can make this line default line because we give only four operator +-*/
                    System.out.println(n1/n2);              // we can do like this:  default: sout (n1/n2)
                    break;
                default:
                    System.out.println("Invalid input");

            }



        } else  {
            System.out.println("Invalid Operator: " + operator);
        }

    }
}
