package day31_Constructors;

public class Person {
    public String name;
    public char gender;
    public int age;
    /*to create a constructor for not using setInfo again and again
       public Person(){ // this is a constructor
    }*/
        public Person (String name,char gender, int age){
            this.name=name;
            this.gender= gender;
            this.age= age;
        }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
/* we have Person custom class,
in this custom class we have three instance variables,
one constructor with three parameters
and toString method
 */
