import Packages.*;

public class Main {
    
    public static void main(String[] args) {
        ClinicRoom room=new ClinicRoom("C-12", 3);
        Appointment apt1=new Appointment("AP-317", "Ali", "Monday", "10:30 AM");
        Appointment apt2=new Appointment("AP-318", "Ayehsaz", "Tuesday", "11:00 AM");

        apt1.assignRoom(room);
        apt2.assignRoom(room);

        HospitalSchedule schedule=new HospitalSchedule("H-01");
        schedule.addAppointment(apt1);
        schedule.addAppointment(apt2);

        System.out.println(schedule.getCount());

        apt1.checkIn();

        apt1.displayAppointment();
        System.out.println(apt1.getSlipNo());

        apt2.cancel();
        apt2.checkIn();
       System.out.println(apt2.getSlipNo());

       System.out.println(room.getOccupied());

       schedule.closeSchedule();
       System.out.println(schedule.getCount());

       apt1.displayAppointment();

       Appointment apt3=new Appointment("AP-319", "Ayehsa", "Tuesday", "1:00 PM");
       schedule.addAppointment(apt3);

    }
}
