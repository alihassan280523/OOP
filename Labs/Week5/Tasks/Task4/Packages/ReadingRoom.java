package Labs.Week5.Tasks.Task4.Packages;

public class ReadingRoom {
    
    private final String roomId;
    private int capacity;
    private int occupied;

    public ReadingRoom(String id,int capacity){
        this.roomId=id;
        this.capacity=capacity;
        this.occupied=0;
    }

    public void display(){
        System.out.println("\nRoom Id: "+roomId);
        System.out.println("Capacity: "+capacity);
        System.out.println("Seats occupied: "+occupied);
        System.out.println("Seats available: "+seatsAvailable());
    }

    public void occupySeat(){
        if(occupied<capacity){

            occupied++;
            System.out.println("Seat occupied, remaining seats: "+seatsAvailable());
        }
        else{
            System.out.println("Room is full");
        }
    }

    public void freeSeat(){
        if(occupied==0){
            System.out.println("Invalid command, room already free");
        }
        else{
            occupied--;
            System.out.println("\nOne seat freed,seats availble: "+seatsAvailable());
        }
    }

    public int seatsAvailable(){
        return (capacity-occupied);
    }
}
