package Labs.Week6.Tasks.Task2.Packages;

public class VisitorPass {
    public final String passId;
    public String name;
    public boolean isActive;

    public VisitorPass(String id,String name){
        this.passId=id;
        this.name=name;
        this.isActive=false;
    }

    public void activatePass(){
        if(isActive){
            System.out.println("\nPass already active");
        }
        else{
            isActive=true;
            System.out.println("\nPass activated");
        }
    }


    public void deactivatePass(){
        if(isActive){
            isActive=false;
            System.out.println("\nPass deactivated");
        }
        else{
            System.out.println("\nPass already deactive");
        }
    }

    public void display(){
        System.out.println(passId+" | "+name+" | "+(isActive? "Active":"InActive"));
    }

}
