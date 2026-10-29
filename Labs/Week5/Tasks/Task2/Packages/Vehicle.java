package Labs.Week5.Tasks.Task2.Packages;

public class Vehicle {
    
    private final String registrationNumber;
    private String ownerName;
    private int[] durationHours;
    private boolean inside;
    private static int recordsCreated;

    public Vehicle(String regNum,String name,int[] hours,boolean inside){
        this.registrationNumber=regNum;
        this.ownerName=name;
        this.durationHours=hours;
        this.inside=inside;
        Vehicle.recordsCreated++;
    }

    public int deriveTotalHours(){
        
        int sum=0;
        for(int i:durationHours){
            sum+=i;
        }

        return sum;
    }

    public void recordEntry(){

        if(inside){
            System.out.println("Entry denied, vehicle already inside");
        }
        else{

            inside=true;
            System.out.println("Entry recorded: "+registrationNumber);
        }
    }

    public void recordExit(){
        if(inside){

            inside=false;
            System.out.println("Exit recorded: "+registrationNumber);

        }
        else{
            System.out.println("Exit denied, vechicle is not inside");
        }
    }

    public void updateDuration(int index,int hours){
        if(index<0||index>2){
            System.out.println("Index out of bound");
        }
        else if(hours<0||hours>=24){
            System.out.println("Invalid hours value");
        }
        else{
            durationHours[index]=hours;
            System.out.println("Duration updated");
        }
    }

    public String display(){
       
        return(
            registrationNumber+"\n"+
            ownerName+"\n"+
            deriveTotalHours()+"\n"
        );
    }
     public static int getTotalRecords(){
        return recordsCreated;
     }
}
