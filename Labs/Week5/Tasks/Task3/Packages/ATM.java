package Labs.Week5.Tasks.Task3.Packages;

public class ATM {
    
    private final String machineId;
    private String location;
    private boolean status;

    public ATM(String id,String location,boolean status){
        this.machineId=id;
        this.location=location;
        this.status=status;
    }

    public void setWorking(boolean val){
        this.status=val;
    }

    public void display(){
        System.out.println("\nMachine Id: "+machineId);
        System.out.println("Location: "+location);
        System.out.println("Status: "+status);
    }
}
