package day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

    public void setInfo (String name, char gender, int age, int ID, char grade){
      // this keyword is sing to call the instance variable
        this.name= name;
        this.gender= gender;
        this.age= age;
        this.ID= ID;
        this.grade= grade;

    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }


}
