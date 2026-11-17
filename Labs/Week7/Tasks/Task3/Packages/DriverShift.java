package Packages;

import java.util.ArrayList;

public class DriverShift {
    private final String shiftId;
    Driver driver;
    ArrayList<Ride> rideList;
    private int rideCount;

    public DriverShift(String id){
        this.shiftId=id;
        rideList=new ArrayList<>();
        rideCount=0;
    }

    public void assignDriver(Driver driver){
        if(this.driver==null){

            this.driver=driver;
        }
        else{
            System.out.println("\nDriver already assigned to this shift\n");
        }
    }

    public void assignRide(Ride ride){
        if(rideList.contains(ride)){
            System.out.println("\nDuplicate ride not allowed\n");
        }
        else{

            this.rideList.add(ride);
            rideCount++;
        }
    }

    public double calculateAssignedFair(){
        double fare=0;

        for(Ride ride : rideList){
            fare+=ride.getEstimatedFare();
        }

        return fare;
    }

    public void endShift(){
        System.out.println("\nShift ended\n");
        rideList=null;
    }

    public void displayShift(){
        System.out.println("\n"+shiftId+" | "+driver.getDriverName()+" | "+rideCount);
        System.out.println("Combined estimated fair: "+calculateAssignedFair());
    }
}
