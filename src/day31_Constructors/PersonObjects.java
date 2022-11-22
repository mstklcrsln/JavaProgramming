package day31_Constructors;

public class PersonObjects {
    public static void main(String[] args) {

     Person person1=  new Person("Mesut",'M',41);
     Person person2 = new Person("Ravza",'F', 11);
     Person person3= new Person("Daniel", 'M',32);

        System.out.println(person2); //Person{name='Ravza', gender=F, age=11}
    }
}
