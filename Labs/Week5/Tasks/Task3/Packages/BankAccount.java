package Labs.Week5.Tasks.Task3.Packages;

public class BankAccount {
    
    private final String accountNumber;
    private String name;
    private double balance;
    private double[] recentDeposits;
    private static int accountsCreated=0;
    private double totalRecentDeposits;

    public BankAccount(String acctNum,String name,double balance,double[] recentDeposits){
        this.accountNumber=acctNum;
        this.name=name;
        this.balance=balance;
        this.recentDeposits=recentDeposits;
        BankAccount.accountsCreated++;
        this.totalRecentDeposits=recentDeposits[0]+recentDeposits[1]+recentDeposits[2];

    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amt){
        if(amt<=0){
            System.out.println("\nAmount is invalid");
        }
        else{

            balance+=amt;
            System.out.println("\nAmount deposited successfully");
        }
    }

    public void withdraw(double amt){
        if(amt<=0||amt%500!=0){
            System.out.println("Invalid amt, please enter amount in multiples of 500");
        }
        else if(amt>balance){
            System.out.println("\nInsufficient funds");
        }
        else{
            balance-=amt;
            System.out.println("\nAmount withdrawn successfully");
        }
    }

    public double calculateTotalRecentDeposits(){
        double total=0;
        for(double val:recentDeposits){
            total+=val;
        }

        return total;
    }

    public void displayAccount(){
        System.out.println("\nAccount Number: "+accountNumber);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
        System.out.println("Total Recent Deposits: "+calculateTotalRecentDeposits());
    }

    public static int getAccountsCreated(){
        return accountsCreated;
    }
}
