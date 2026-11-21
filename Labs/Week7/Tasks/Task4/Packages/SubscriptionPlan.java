package Packages;

import java.util.ArrayList;

public class SubscriptionPlan {
    private final String code;
    private String name;
    private double monthlyPrice;
    private boolean status;
    private ArrayList<ViewingRecord> records;
    private int recordCount;

    public SubscriptionPlan(String code,String name,double price){
        this.code=code;
        this.name=name;
        this.monthlyPrice=price;
        this.status=false;
        this.records=new ArrayList<>(1);
        this.recordCount=0;
    }

    public void activateSubscription(){
        if(status){
            System.out.println("\nSubscription already activated\n");
            return;
        }

        status=true;
    }

    public void deactivateSubscription(){
        if(status==false){
            System.out.println("\nSubscription already inactive\n");
            return;
        }

        status=false;
    }

    public void startViewing(String id,String title,int duration){
        if(status==false){
            System.out.println("\nPlan inactivate. Please activate your plan\n");
            return;
        }

        if(duration<=0){
            System.out.println("\nError: invalid duration entered!\n");
            return;
        }

        for(int i=0;i<recordCount;i++){
            if(records.get(i).getId().compareTo(id)==0){
                System.out.println("\n"+id+" record already exists\n");
                return;
            }
        }
        
        records.add(new ViewingRecord(id, title, duration));
        recordCount++;
        System.out.println("\nViewing record added\n");
    }

    public void pauseViewing(String id,int minutes){

        boolean isFound=false;
        for(int i=0;i<recordCount&&!isFound;i++){
            if(records.get(i).getId().compareTo(id)==0){
                records.get(i).setProgress(minutes);
                isFound=true;
            }
        }

        if(!isFound){
            System.out.println("\nError can not find record with id: "+id+"\n");
        }


    }

    public int remainingMinutes(String id){
        for(int i=0;i<recordCount;i++){
            if(records.get(i).getId().compareTo(id)==0){
                return records.get(i).remainingMinutes();
            }
        }

        return 0;
    }

    public void cancelPlan(){
        if(!status){
            System.out.println("\nPlan inactive\n");
            return;
        }

        records.clear();
        records=null;
        status=false;
        recordCount=0;
        System.out.println("\nPLan cancelled\n");
    }


    public void displayViewings(){
        for(int i=0;i<recordCount;i++){
            records.get(i).displayDetails();
        }
    }

    public int getRecordCount(){
        return recordCount;
    }
}
