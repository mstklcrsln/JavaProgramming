package day39_Inheritence_Encapsulation.shape;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square1= new Square(5);

        System.out.println(square1); //Square{side=5.0, area=25.0, perimeter=20.0}

        System.out.println(square1.area()); //25.0
        System.out.println(square1.perimeter()); //20.0

        square1.setSide(10);
        System.out.println(square1); //Square{ side= 10.0, area= 100.0, perimeter= 40.0}

        System.out.println("--------------------------");

        Circle circle1 = new Circle(4.5);
        System.out.println(circle1); // Circle{radius=4.5, pi=3.14, area='63.585', perimeter='28.26'}
        System.out.println(circle1.area()); // 63.585
        System.out.println(circle1.perimeter()); // 28.26

        System.out.println("---------------");

       Rectangle rectangle1 = new Rectangle(5,10);
        System.out.println(rectangle1); //Rectangle{length=5.0, width=10.0, area='50.0', perimeter='30.0'}

        // rectangle1.setWidth(-5);
       // System.out.println(rectangle1);       ==> Invalid width -5.0

        System.out.println(rectangle1.perimeter()); //30.0
        System.out.println(rectangle1.area());      //50.0

        rectangle1.setWidth(2);
        System.out.println(rectangle1); //Rectangle{length=5.0, width=2.0, area='10.0', perimeter='14.0'}

        System.out.println(rectangle1.getName()); //Rectangle


    }
}
