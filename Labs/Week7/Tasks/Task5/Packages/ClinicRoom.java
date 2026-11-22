package Packages;

public class ClinicRoom {
    private final String roomNo;
    private int capacity;
    private int occupied;

    public ClinicRoom(String room,int capacity){
        this.roomNo=room;
        this.capacity=capacity;
        this.occupied=0;
    }

    public boolean admitPatient(){
        if(occupied<capacity){
            occupied++;
            return true;
        }
        
        return false;

    }

    public void dischargePatient(){
        occupied--;
        System.out.println("\nPatient discharged\n");
    }

    public String getRoomNo(){
        return roomNo;
    }

    public int getOccupied(){
        return occupied;
    }

    public void displayRoom(){
        System.out.println(roomNo+" | "+capacity+" | "+occupied);
    }
}
