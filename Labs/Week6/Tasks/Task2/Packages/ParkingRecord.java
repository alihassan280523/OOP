package Labs.Week6.Tasks.Task2.Packages;

public class ParkingRecord {
    
    private final String registrationNumber;
    private String name;
    private boolean inCampus;
    private int[] durations;
    private static int recordsCreated;

    static{
        recordsCreated=0;
    }

    public ParkingRecord(String regNum,String name,int[] durations){
        this.registrationNumber=regNum;
        this.name=name;
        this.inCampus=false;
        this.durations=durations;
        ParkingRecord.recordsCreated++;
    }

    public ParkingRecord(ParkingRecord otherRecord){
        this.registrationNumber=otherRecord.registrationNumber;
        this.name=otherRecord.name;
        this.inCampus=otherRecord.inCampus;
        this.durations=otherRecord.durations;
        ParkingRecord.recordsCreated++;
    }

    public ParkingRecord(ParkingRecord otherRecord,boolean deep){
        this.registrationNumber=otherRecord.registrationNumber;
        this.name=otherRecord.name;
        this.inCampus=otherRecord.inCampus;
        this.durations=new int[3];

        for(int i=0;i<3;i++){
            this.durations[i]=otherRecord.durations[i];
        }

        ParkingRecord.recordsCreated++;
    }

    public void recordEntry(){
        if(inCampus){
            System.out.println("Car already inside campus");
        }
        else{
            inCampus=true;
            System.out.println("Entry recorded: "+registrationNumber);
        }
    }

    public void recordExit(){
        if(inCampus){
            inCampus=false;
            System.out.println("Exit recorded: "+registrationNumber);
        }
        else{
            System.out.println("Car in not in campus");
        }
    }

    public static int getRecordsCreated(){
        return recordsCreated;
    }

    public double calculateAverageDurationHours(){
        double total=0;

        for(int i:durations){
            total+=i;
        }

        return total/3;
    }

    public void updateDuration(int index,int hour){
        if(index<0||index>2){
            System.out.println("\nIndex out of bound");
        }
        else if(hour<0||hour<6||hour>18){
            System.out.println("\nInvalid hour, allowed hours are between 6 and 18");
        }
        else{
            durations[index]=hour;
            System.out.println("\nHour updated");
        }
    }


    public void display(){
        System.out.printf("%s | %s | %.2f | %s\n",registrationNumber,name,calculateAverageDurationHours(),(inCampus? "Car in Campus":"Car not in campus"));
        // System.out.println(registrationNumber+" | "+name+" | "+calculateAverageDurationHours()+" | "+(inCampus? "Car in Campus":"Car not in campus"));
    }

    public boolean isLongerThan(ParkingRecord otherRecord){

        return (
            this.calculateAverageDurationHours()>otherRecord.calculateAverageDurationHours()
        );
    }

    public ParkingRecord getLongerRecord(ParkingRecord otherRecord){
        if(this.calculateAverageDurationHours()>otherRecord.calculateAverageDurationHours()){
            return this;
        }
        else{
            return otherRecord;
        }
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }
}
