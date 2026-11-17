package Packages;

public class Driver {
    private final String driverId;
    private String driverName;

    public Driver(String id,String name){
        this.driverId=id;
        this.driverName=name;
    }

    public String getGriverId(){
        return driverId;
    }

    public String getDriverName(){
        return driverName;
    }

    public void displayDriverInfo(){
        System.out.println("\n"+driverId+" | "+driverName+"\n");
    }
}
