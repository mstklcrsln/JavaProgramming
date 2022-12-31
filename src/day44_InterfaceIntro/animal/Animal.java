package day44_InterfaceIntro.animal;
    /* class  Test{
    public static void main(String[] args) {

        System.out.println(new Test().getClass().getSimpleName()); //Test
        System.out.println(new Test().getClass().getName()); //day44_InterfaceIntro.animal.Test
    }
}
*/
public abstract class Animal {

    private String name;
    private final String breed; // we don't want to change/set this value again
    private final char gender;// we don't want to change/set this gender again
    private int age;
    private String size;
    private final String color;// we don't want to change/set this color again

    //every single animal breathes
    public final static boolean canBreath; // we put final, so this can not change. It is constent, unchangable
    static {
        canBreath=true;
    }
    /*
    final and static have different purpose.
    Static is making sure that this variable has only one copy. With only static keyword value can be changed/ re-assigned. One copy of this can share all the animals
    Final keyword provide us not changeble. Locker
     */

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;
        if (! (gender=='M' || gender=='F')){
            throw new RuntimeException("ınvalid entry "+ gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            throw new RuntimeException("Invalid name "+ name);
        }
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public final void drink (){
        System.out.println(name+ " is drinking");
    }
    public abstract void eat();

    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
