package day39_Inheritence_Encapsulation.shape;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }
    //we create getter and setter for the other classes can reach this object

    public void setName(String name) { // setter ensures us to assign right values to the variables
        if (name== null){
            System.err.println("Name can not be null");
            System.exit(1); // status code 1 is for only this situation, when situation is true, user can go on
            // exit 1 status means: something went wrong
        }
        if (name.isBlank() || name.isEmpty()){
            System.err.println("ınvalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) {
        this.name = name;
    } //this is constructor

    public double area (){ // this is area method and it needs body
        return 0; // we returned 0 as instance, we can change it in the sub class's
    }
    public double perimeter (){
        return 0;
    }
/*
Shape:
	variables:
			name
	Encapsulate the field

	Add a constructor to set the filed
	Methods:
		area(){}
		perimeter(){}
 */
}



























