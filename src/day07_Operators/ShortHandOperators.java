package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        //assigment
        int number= 100;
        System.out.println("first number= "+ number); //100

        number = 200; // we give new value after this line new value is 200

        System.out.println("seond number = " + number); //200

        String word ="Java Programming";
        System.out.println("word = " + word); //Java Programming

        // after this line we will assign a new value --->update the value

        word = "Wooden Spoon";
        System.out.println("word = " + word); // it will be Wooden Spoon

        word = "Cydeo";
        System.out.println("word = " + word); //only string to string

        word = "Java Programming"; // again i give old value

        System.out.println("word = " + word);


        System.out.println("---------------------------------------------------");

        // addition assigment

        int x= 100;

        System.out.println("x = " + x); //100
        System.out.println(x+ 200); // 300

       // x= x+200; //300
       // the shortcut of this is x+=200
        x+= 200; // x will be x+200=300 after this line
        System.out.println("x = " + x);

        String str = "Wooden";
        str+=  " Spoon"; // after this line str will be Wooden + Spoon

        System.out.println(str); // wooden spoon

        double num1= 2.5;
        System.out.println("num1 = " + num1); //2.5

        num1 +=5.5; // it will be 8.0
        System.out.println("num1 = " + num1);


        double avaibleBalance = 100.50;
        // deposit 300$ to this account will be

        avaibleBalance += 300; // avaibleBalance = 100.5+ 300
        System.out.println("avaibleBalance = " + avaibleBalance);


        System.out.println("---------------------------------------------------");


        // withdrawing 100$ from bank account
        avaibleBalance -= 260; // if this is += it will be a bug
        System.out.println("avaibleBalance = " + avaibleBalance);

        System.out.println("---------------------------------------------------");

        double salary = 50000.50;
        System.out.println("salary " + salary);

        salary *=2;  //salary = salary*2
        System.out.println("salary = " + salary);


        double doge = 0.0000001;
        doge *=10000000;
        System.out.println("doge coin current price = " + doge);

        System.out.println("---------------------------------------------------");

        double num2 = 25000.0;

        num2 /= 2;

        System.out.println("num2 = " + num2);

        System.out.println("---------------------------------------------------");

        double num3= 100;
        // %=

        num3 %= 3; // remainder from 100/3 ==>1
        System.out.println("num3 = " + num3);

        System.out.println("---------------------------------------------------");

        int amount  = 127; // in cents

        int quarters = 127/25; // 127 cents 5 quarters (25 and two cents )
        int cents = amount%25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("---------------------------------------------------");

        int cents2= 127;


        cents2 %=25; //will give us the remainder
        System.out.println("cents2 = " + cents2);

        System.out.println("---------------------------------------------------");
        int y=300;
        y%= 16;

        System.out.println("y = " + y); //12

        System.out.println("---------------------------------------------------");
        int balance= 3500;

        //insurance fee: 153$

        balance%=153; // evermonth i pay 153 dolar and after 134 month i need new deposit

        System.out.println("balance = " + balance);




    }
}
