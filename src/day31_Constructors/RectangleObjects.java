package day31_Constructors;

public class RectangleObjects {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5.5,3.5);
        Rectangle rectangle2 = new Rectangle(6.5,55);
        Rectangle rectangle3 = new Rectangle(9,23);
        Rectangle rectangle4 = new Rectangle(1,2.5);

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        /*
        Rectangle{length=5.5, width=3.5, area=19.25, perimeter=18.0}
        Rectangle{length=6.5, width=55.0, area=357.5, perimeter=123.0}
        Rectangle{length=9.0, width=23.0, area=207.0, perimeter=64.0}
         */
    }
}
