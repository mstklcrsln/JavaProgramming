package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Mesut Kilic", 987456321 );
     //    System.out.println(account1); BankAccount{accountHolder='Mesut Kilic', accountNumber=987456321, balance= $0.0}
        account1.deposit(1000);
        account1.checkBalance(); //Your available balance is :1000.0

        account1.withdraw(900);
        account1.checkBalance();  //Your available balance is :100.0

        BankAccount account2 = new BankAccount();
        account2.setInfo("Ahmet Dogan", 123654799);
        account2.deposit(1500);
        System.out.println(account2); //BankAccount{accountHolder='Ahmet Dogan', accountNumber=123654799, balance= $1500.0}
        account2.checkBalance(); //Your available balance is :1500.0
    }
}
