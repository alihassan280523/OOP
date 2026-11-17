package Packages;

public class Ride {
    private final String rideId;
    private String pickUp;
    private String destination;
    private double estimatedFair;
    private double finalFare;
    private String status;

    public Ride(String id,String pickUp,String dest,double fair){
        this.rideId=id;
        this.pickUp=pickUp;
        this.destination=dest;
        this.estimatedFair=fair;
        this.finalFare=0;
        this.status="Pending";
    }

    public void startRide(){
        if(status.compareTo("Pending")!=0){
            System.out.println("\nRide already started invalid value");
        }
        else{
            System.out.println("\nRide Started!!");
            status="Started";
        }
    }

    public void completeRide(double finalFare){

        if(status.compareTo("Pending")==0){
            System.out.println("\nInvalid operation, first start the ride");
        }
        else if(status.compareTo("Completed")==0){
            System.out.println("\nRide already completed");
        }
        else if(finalFare<=0){
            System.out.println("\nInvalid ride fare");
        }
        else{
            System.out.println("\nRide completed. Your final fair is "+finalFare);
            status="Completed";
            this.finalFare=finalFare;
        }
    }
    
    private double getFair(){
        if(status.compareTo("Pending")==0){
            return estimatedFair;
        }
        else if(status.compareTo("Started")==0){
            return estimatedFair;
        }
        else{
            return finalFare;
        }
    }
    public void displayRide(){
        System.out.println("\n"+rideId+" | "+pickUp+" | "+destination+" | "+(getFair())+" | "+status+"\n");
    }

    public double getEstimatedFare(){
        return estimatedFair;
    }


}
