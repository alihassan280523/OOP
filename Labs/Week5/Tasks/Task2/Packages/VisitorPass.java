package Labs.Week5.Tasks.Task2.Packages;

public class VisitorPass {
    
    private final String passCode;
    private String visitorName;
    private boolean isValid;

    public VisitorPass(String passCode,String visitorName,boolean isValid){
        this.passCode=passCode;
        this.visitorName=visitorName;
        this.isValid=isValid;
    }

    public String display(){
        return(
            passCode+"\n"+visitorName+"\n"+
            ((isValid)? "Active":"InActive")
        );
    }
}
