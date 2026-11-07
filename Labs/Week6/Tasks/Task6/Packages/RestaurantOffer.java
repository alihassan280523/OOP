package Labs.Week6.Tasks.Task6.Packages;

public class RestaurantOffer {
    private final String offerId;
    private String description;
    private int discountPercent;
    private boolean assigned;

    public RestaurantOffer(String offerId,String description){
        this.offerId=offerId;
        this.description=description;
    }

    public void setDiscountPercent(int value){
        if(value<0||value>100){
            System.out.println("\nInvalid discount value");
        }
        else{
            discountPercent=value;
        }
    }

    public boolean isAssigned(){
        return assigned;
    }

    public void markAssigned(){
        if(assigned){
            System.out.println("\n"+offerId+ " already assigned");
            return;
        }

        assigned=true;
    }

    public int getDiscountOffer(){
        return discountPercent;
    }

    public void displayOffer(){
        System.out.println("\n"+offerId+" | "+description+" | "+discountPercent+" | "+(assigned? "Assigned":"Unassigned"));
    }

    public String getOfferId(){
        return offerId;
    }
}
