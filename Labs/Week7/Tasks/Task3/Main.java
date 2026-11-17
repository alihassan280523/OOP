import Packages.*;

public class Main{

    public static void main(String[] args) {
        Driver kamran =new Driver("D-10","Mr. Kamran");
        Ride ride1=new Ride("R-908", "UCP", "Gulberg", 720);
        Ride ride2=new Ride("R-909", "UCP", "Johar Town", 500);

        DriverShift shift=new DriverShift("S-01");

        shift.assignDriver(kamran);
        shift.assignRide(ride1);
        shift.assignRide(ride2);

        shift.displayShift();

        shift.assignRide(ride2);

        ride1.completeRide(800);
        ride1.startRide();
        ride1.completeRide(800);

        ride1.displayRide();

        shift.endShift();
        ride1.displayRide();
    }
}