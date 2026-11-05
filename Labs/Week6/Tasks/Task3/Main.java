package Labs.Week6.Tasks.Task3;
import Labs.Week6.Tasks.Task3.Packages.*;

public class Main {
    public static void main(String[] args) {
        BankAccount ali=new BankAccount("4821","Ali",20000,new double[] {1000,2000,500});        
        BankAccount sara=new BankAccount("7930","Sara",8000,new double[] {500,500,500});        

        BankAccount copy=new BankAccount(ali);
        BankAccount deepCopy=new BankAccount(ali,true);

        ali.updateDepositHistory(0, 1500);
        System.out.println("Shallow: "+copy.getTotalRecentDeposits());
        System.out.println("Deep: "+deepCopy.getTotalRecentDeposits());
        ali.transferTo(sara, 2000);
        ali.transferTo(sara, 100000);
        ali.getBalance();
        sara.getBalance();
        System.out.println("Richer is: "+ali.getRicherAccount(sara).getName());
        ali.displayAccount();
        sara.displayAccount();
        System.out.println("Accounts created: "+BankAccount.getAccountsCreated());


        AtmMachine atm=new AtmMachine("1", "UCP-Gate", true);
        atm.display();
    }
}
