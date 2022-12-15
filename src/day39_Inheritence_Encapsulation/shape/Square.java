package day39_Inheritence_Encapsulation.shape;

public class Square extends Shape {

    // first give the variables and methods can not be inherited, than extend the class
    private double side;

    public Square(String name) {
        super(name);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0 ){
            System.err.println("Invalid size "+ side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square( double side) {
        /* public Square(String name, double side) {
        super(name);
         this.side = side;  it comes default like this. But in this stage if user gives -1 it will assigned to our variable.
        To avoid this we change this.side = side;
        setSide(side);
        we delete the name and make it square in the below
    }*/
        super("Square");
        setSide(side);
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{ " +
                "side= " + side +
                ", area= " + area() +
                ", perimeter= " + perimeter() +
                '}';
    }
}
/*
Square extends Shape:
	variables:
		side;

	Encapsulate the field

	Add a constructor to set the filed

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter

 */