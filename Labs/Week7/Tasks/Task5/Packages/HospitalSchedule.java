package Packages;

import java.util.ArrayList;

public class HospitalSchedule {
    private final String id;
    private ArrayList<Appointment> appointments;
    private int count;
    private boolean status;

    public HospitalSchedule(String id){
        this.id=id;
        this.appointments=new ArrayList<>(1);
        this.count=0;
        this.status=true;
    }

    public void addAppointment(Appointment appointment){
        if(!status){
            System.out.println("\nThis schedule is closed, can not add new appointments\n");
            return;
        }

        if(appointment==null){
            System.out.println("\nCan not accept null values\n");
            return;
        }

        for(int i=0;i<count;i++){
            if(appointments.get(i).getAppointmentId().compareTo(appointment.getAppointmentId())==0){
                System.out.println("\nThis appointment already exists\n");
                return;
            }
        }

        appointments.add(appointment);
        count++;
    }

    public void closeSchedule(){
        // appointments.clear();
        // appointments=null;
        // count=0;
        status=false;
    }

    public int getCount(){
        return count;
    }
}
