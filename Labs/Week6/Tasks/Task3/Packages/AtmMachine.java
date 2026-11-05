package Labs.Week6.Tasks.Task3.Packages;

public class AtmMachine {
    private final String machineId;
    private String location;
    private boolean working;
    
    public AtmMachine(String id,String location,boolean val){
        this.machineId=id;
        this.location=location;
        this.working=val;

    }
    
    public void display(){
        System.out.println(machineId+" | "+location+" | "+(working? "Working":"Not Working"));
    }
}
