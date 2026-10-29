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
}
