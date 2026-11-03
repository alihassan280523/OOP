package Labs.Week6.Tasks.Task2;

import Labs.Week6.Tasks.Task2.Packages.*;

public class Main {
    public static void main(String[] args) {
        ParkingRecord car1=new ParkingRecord("LHR-1234","Dr Ahmed",new int[] {2,3,1});
        ParkingRecord car2=new ParkingRecord("LHR-5678","Ms. Sara",new int[] {1,1,2});

        car1.display();
        car2.display();

        System.out.println("Records Created: "+ParkingRecord.getRecordsCreated());

        System.out.println("Longer Record: "+car1.getLongerRecord(car2).getRegistrationNumber());

        car1.recordExit();
        car1.recordEntry();

        ParkingRecord car1ShallowCopy=new ParkingRecord(car1);
        ParkingRecord car1DeepCopy=new ParkingRecord(car1,true);

        car1.updateDuration(0, 6);

        System.out.printf("Shallow Copy: %.2f\n",car1ShallowCopy.calculateAverageDurationHours());
        System.out.println("Deep Copy: "+car1DeepCopy.calculateAverageDurationHours());
        System.out.println("Records created: "+ParkingRecord.getRecordsCreated());

        VisitorPass visitor=new VisitorPass("VP-10", "Noor");
        visitor.display();
        visitor.activatePass();

        visitor.display();
    }
}
