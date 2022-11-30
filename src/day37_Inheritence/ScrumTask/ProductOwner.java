package day37_Inheritence.ScrumTask;

public class ProductOwner extends  Employee {

    public ProductOwner(String name, int age, char gender,  int ID, double salary, String companyName) {
        super(name, age, gender, "PO", ID, salary, companyName);
    }

    public void reqGathering (){
        System.out.println(name+ " is getting requirement gattering");
    }
}
