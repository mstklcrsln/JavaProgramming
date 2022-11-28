package day36_Inheritence.encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender;
    private char grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        //for checking the requirements we must change this block
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }

    public String getName (){
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public int getAge (){
        return age;
    }

    public void setAge (int age){
        if (age<5 || age>90){
            System.err.println("ınvalid entry");
            System.exit(0); // terminates the all code
            //return;               terminates only this method code block
        }
        this.age=age;
    }

    public char getGender (){
        return gender;
    }

    public void setGender (char gender){
        if( ! (gender=='M' || gender=='F')){
            return;
        }
        this.gender= gender;
    }

    public char getGrade (){
        return grade;
    }

    public void setGrade (char grade){
        if (! (grade== 'A' || grade== 'B' || grade== 'C' || grade== 'D' || grade== 'E' )){
            return;
        }
        this.grade= grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study (){
        System.out.println(name+ " is studying");
    }
}

/*
1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName
			Encapsulate all the fields (at least encapsulate two fields manually)
					requirements:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any character other than: 'M' and 'F'
						3. grade should not be set to any character other than: 'A', 'B', 'C', 'D', and 'F'
			Add a constructor that can set all the fields when the object is created
						(requirements of fields in the above must be applied)
			Methods:
				study()
				toString()
 */
