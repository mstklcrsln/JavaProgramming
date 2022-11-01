package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

    int num1= 25; //+ symbol is optional
        int num2 = -25; //- is required

        System.out.println(num1<0); //false
        System.out.println(num2<0); //true
        System.out.println("---------------------------------------------");


        System.out.println( ++num1);
        System.out.println( num1++);

        System.out.println( --num1);
        System.out.println( num1--);

        int a =5;
        ++a; //pre-incrementis it going to increases value 1 immediately
        System.out.println(a);

        --a ; // pre dicrment it going to decrease  value 1 immediately
        System.out.println(a);

        System.out.println("--------------------------------------------");
        a++;
        System.out.println(a);

        a--;
        System.out.println(a);

        System.out.println("---------------------------------------------");
        int b=100;

        System.out.println(++b); //pre increment: increases the value 1 right way


        int c= 100;
        System.out.println(c++); //post increment: it passes the currrent value,  it not change immediately, it postphones formul works in the next step,
        System.out.println(c);// it will  be 101

        System.out.println("---------------------------------------------");

        int x= 200;
        System.out.println(--x); //it works immediately works now. 199

        int y= 200;
        System.out.println(y--); // it works in the next step 200;
        System.out.println(y);
        System.out.println("---------------------------------------------");
        int f= 25;
        System.out.println(++f); //26
        System.out.println(--f); //25
        System.out.println("---------------------------------------------");
        int h = 25;
        System.out.println(h++);
        System.out.println(h--);

        System.out.println("---------------------------------------------");


        int z= 45;
        System.out.println(++z); //46 after this line z is 46
        System.out.println(z++); //46 after this line z will be 47 because post increament will work
        System.out.println(z); //47


        System.out.println("---------------------------------------------");

        int q= 30;
        System.out.println(--q);//29
        System.out.println(q--); //29
        System.out.println(q); //28

    }


}
