package Labs.Week5.Tasks.Task2;
import Labs.Week5.Tasks.Task2.Packages.*;

public class Main {
    
    public static void main(String[] args) {
        
        Vehicle[] arr=new Vehicle[2];

        arr[0]=new Vehicle("LHR-1234","Dr. Ahmad",new int[] {2,3,1},false);
        arr[1]=new Vehicle("LHR-5678","Ms. Sara",new int[] {1,1,2},false);

        System.out.println(Vehicle.getTotalRecords());
        System.out.println("\n"+arr[0].display());
        System.out.println("\n"+arr[1].display());

        arr[0].recordEntry();
        arr[0].recordExit();
        arr[0].recordExit();    //ERROR

        Vehicle alias=arr[0];

        System.out.println(Vehicle.getTotalRecords());

        alias.updateDuration(1, 4);

        VisitorPass obj=new VisitorPass("101", "Noor", true);

        System.out.println(obj.display());
    }
}
