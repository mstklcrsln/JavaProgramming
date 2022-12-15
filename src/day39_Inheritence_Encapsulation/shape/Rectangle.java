package day39_Inheritence_Encapsulation.shape;

public class Rectangle extends Shape {


    /*
    while creating child class:
    1- Add the features that can bot be inherited from parent class.
    So constructor will get these
    2- add getter and setter, because they will not be inherited from parent class
    3- add requirements to the setter to be sure that user can not put negative numbers
    4- After finishing these phases apply the extends keyword
    5- Add constructor with all these fields (length, width)
    6- Work on other methods about rectangle
    7- Override methods from parent class, by right click/generate/oerride
    8- Generate the toString method in the rectangle class for include length and width
    9- Add knowledge about area and perimeter into the toString method

     */
    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.err.println("Invalid length " + length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.err.println("Invalid width " + width);
            System.exit(1);
            this.width = width;
        }
    }

    public Rectangle( double length, double width) {
        super("Rectangle");
        setLength(length);
       // this.width = width;       we change this part
        setWidth(width);
    }

    @Override
    public double area() {
       // return super.area(); we change - override this part
        return length*width;
    }

    @Override
    public double perimeter() {
        //return super.perimeter(); we change - override this part
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Rectangle extends Shape:
	variables:
		length
		width

	Encapsulate the fields

	Add a constructor to set the filed

	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter

 */