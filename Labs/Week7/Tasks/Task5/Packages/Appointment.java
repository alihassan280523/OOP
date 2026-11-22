package Packages;

public class Appointment {
    private final String id;
    private String patientName;
    private String date;
    private String time;
    private boolean status;
    private ClinicRoom clinicRoom;
    private CheckinSlip slip;

    public Appointment(String id,String name,String date,String time){
        this.id=id;
        this.patientName=name;
        this.date=date;
        this.time=time;
        this.status=true;
        this.slip=null;
    }

    public void assignRoom(ClinicRoom room){
        this.clinicRoom=room;
    }

    public void checkIn(){
        if(!status){
            System.out.println("\nAppointment has been cancelled! can not check in\n");
            return;
        }

        slip=new CheckinSlip("SL-"+id);
        clinicRoom.admitPatient();
        
    }

    public void cancel(){
        if(!status){
            System.out.println("\nAppointment already cancelled\n");
            return;
        }

        status=false;
    }

    public String getSlipNo(){
        if(slip==null){
            return "\nNo slip generated\n";
        }
        return slip.getSlipNo();
    }

    public String getAppointmentId(){
        return id;
    }

    public void displayAppointment(){
        System.out.println(id+" | "+patientName+" | "+date+" | "+time+" | "+clinicRoom.getRoomNo()+" | "+status);
    }
}
