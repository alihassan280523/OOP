package Labs.Week5.Tasks.Task3;
import Labs.Week5.Tasks.Task3.Packages.*;

public class Main {
    public static void main(String[] args) {
        
        BankAccount[] acct=new BankAccount[2];

        acct[0]=new BankAccount("4821", "Ali", 20000, new double[] {1000,2000,3000});
        acct[1]=new BankAccount("7930", "Sana", 8000, new double[] {500,500,500});

        acct[0].withdraw(10000);
        System.out.println(acct[0].getBalance());

        acct[1].withdraw(30000);

        System.out.println(BankAccount.getAccountsCreated());
        BankAccount alias=acct[0];

        System.out.println(BankAccount.getAccountsCreated());

        acct[0].displayAccount();

        ATM atm=new ATM("ATM-01","UCP Gate",true);

        atm.display();

    }    
}
