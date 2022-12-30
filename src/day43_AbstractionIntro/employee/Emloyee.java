package day43_AbstractionIntro.employee;

public abstract  class Emloyee extends Person {

    private final int id;
    private String jobTitle;
    private  double salary;

    public Emloyee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        //id is final variable so it don't have setter. We give condition here
        if(id<0){
            throw new RuntimeException("Invalid ID "+ id);
        }
        this.id = id;
       setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Emloyee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ",jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
