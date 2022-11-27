package day35_Encapsulation;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings;
    public static int numberOfHead;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    /*
    while executing tests we will have documents (test data) in our computer like this: ExcelSheet (variable)
    in order to set this variable
    1- we need to locate the file
    2- we need to read the file
    3- we need to handle the exceptions
    4- we need to add every singe columns, rows and then read them set them into the variable

    we need a block of code in order to set these steps.
    if ExcelSheet block is static we need static block
    if it is instance we need constructor
     */

    static {
        planet = "Earth";
        isHuman= true;
        hasNose= true;
        numberOfHead= 1;
        numberOfWings=0;
    }

    public static void printPlanetName (){
        System.out.println("Planet name is " + planet);
    }

    public void eat (String food){
        System.out.println (name+ " is eating "+ food);
    }

    public void drink (String drink){
        System.out.println (name+ " is drinking "+ drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
