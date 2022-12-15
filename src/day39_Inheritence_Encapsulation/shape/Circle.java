package day39_Inheritence_Encapsulation.shape;

public class Circle extends Shape {

    /*
      while creating child class:
    1- Add the additional fields and features that can bot be inherited from parent class.
    So constructor will get these
    2- add getter and setter, because they will not be inherited from parent class
    3- add requirements to the setter to be sure that user can not put negative numbers
    4- After finishing these phases apply the extends keyword
    5- Add constructor with all these fields (length, width)
    6- Work on other methods about rectangle
    7- Override methods from parent class, by right click/generate/override. Because we need to give different implementation
    8- Generate the toString method in the rectangle class for include length and width
    9- Add knowledge about area and perimeter into the toString method
     */

    private double radius;

    public static double pi= 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            System.out.println("Invalid entry :"+ radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        // public Circle(String name, double radius) { we clean name and set it under the line
        super("Circle");
        setRadius(radius);
    }

    @Override
    public double area() {
        //return super.area();
        return pi*radius*radius;
    }

    @Override
    public double perimeter() {
        //return super.perimeter();
        return 2*pi*radius;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Circle extends Shape:
		variables:
			radius
			pi (static)

		Encapsulate the field

		Add a constructor to set the filed

		area(): radius * radius * pi
		perimeter(): 2 * radius * pi
		toString(): r, pi, area, perimeter
 */