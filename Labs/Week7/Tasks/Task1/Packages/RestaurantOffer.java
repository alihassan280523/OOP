package Packages;

public class RestaurantOffer {
    private final String offerId;
    private String description;
    private int discountPercent;
    private boolean assigned;

    public RestaurantOffer(String offerId,String description,int percent){
        this.offerId=offerId;
        this.description=description;
        this.discountPercent=percent;
        this.assigned=false;
    }

    public void setDiscountPercent(int discount){
        if(discount<0||discount>100){
            System.out.println("\nThe discount value is invalid");
            return;
        }

        this.discountPercent=discount;
        System.out.println("\nDiscount added");
    }


    public boolean isAssigned(){
        return assigned;
    }

    public void markAssigned(){
        this.assigned=true;
    }

    public void displayOffer(){
        System.out.println("\n"+offerId+" | "+discountPercent+" | "+(isAssigned()? "Assigned":"not assigned"));
    }

    public int getDiscountPercent(){
        return discountPercent;
    }
}
