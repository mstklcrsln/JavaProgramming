package day45_Interfaces.shape;

public class Square extends Shape {

    private double side;

    public Square( double side) {
        super("Square");
        setSide(side);
    }

    public double getSide(double side) {
        return this.side;
    }
    public void setSide(double side) {
        if (side<=0){
            throw new RuntimeException("Invalid size");
        }
        this.side = side;
    }
    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString()+
                "side=" + side +
                '}';
    }
}
