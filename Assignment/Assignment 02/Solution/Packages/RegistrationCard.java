package Packages;

public class RegistrationCard {
    private boolean status;

    public RegistrationCard(){
        status=false;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean val){
        status=val;
    }
}
