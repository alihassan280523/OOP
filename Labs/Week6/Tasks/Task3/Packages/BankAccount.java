package Labs.Week6.Tasks.Task3.Packages;

public class BankAccount {
    private final String accountNumber;
    private String name;
    private double balance;
    private double[] recentDeposits;
    private static int accountsCreated;

    static{
        accountsCreated=0;
    }

    public BankAccount(String acctNum,String name,double balance,double[] recentDeposits){
        this.accountNumber=acctNum;
        this.name=name;
        this.balance=balance;
        this.recentDeposits=recentDeposits;
        accountsCreated++;
    }

    public BankAccount(BankAccount otherAccount){
        this.accountNumber=otherAccount.accountNumber;
        this.name=otherAccount.name;
        this.balance=otherAccount.balance;
        this.recentDeposits=otherAccount.recentDeposits;
        accountsCreated++;
    }

    public BankAccount(BankAccount otherAccount,boolean deep){
        this.accountNumber=otherAccount.accountNumber;
        this.name=otherAccount.name;
        this.balance=otherAccount.balance;

        this.recentDeposits=new double[3];
        
        for(int i=0;i<3;i++){
            this.recentDeposits[i]=otherAccount.recentDeposits[i];
        }

        accountsCreated++;
    }

    public double getBalance(){
        return balance;
    }

    public void updateDepositHistory(int index,int val){
        if(index<0||index>2){
            System.out.println("\nIndex out of bound");
        }
        else if(val<0){
            System.out.println("\nInvalid amount entered");
        }
        else{
            recentDeposits[index]=val;
            System.out.println("\nDeposit history updated");
        }
    }

    public double getTotalRecentDeposits(){
        double total=0;

        for(int i=0;i<3;i++){
            total+=recentDeposits[i];
        }

        return total;
    }

    public void transferTo(BankAccount receiver,double amt){
        if(amt<=0||amt>balance){
            System.out.println("\nInvalid amount");
        }
        else{
            receiver.balance+=amt;
            this.balance-=amt;
            System.out.println("\nAmount sent");
        }

    }

    public BankAccount getRicherAccount(BankAccount otherAccount){
        if(balance>otherAccount.balance){
            return this;
        }
        else{
            return otherAccount;
        }
    }

    public void displayAccount(){
        System.out.println(accountNumber+" | "+name+" | "+balance);

    }

    public static int getAccountsCreated(){
        return accountsCreated;
    }

    public String getName(){
        return name;
    }
}   
