package Labs.Week6.Tasks.Task6.Packages;

public class FoodOrder {
    private final String orderId;
    private String customerName;
    private double itemTotal;
    private boolean status;
    private RestaurantOffer offer;
    private static int orderCount;
    
    static{
        orderCount=0;
    }

    public FoodOrder(String id,String name,double total,boolean status){
        this.orderId=id;
        this.customerName=name;
        this.itemTotal=total;
        this.status=status;
        this.offer=null;
        orderCount++;
    }

    public void assignOffer(RestaurantOffer offer){
        if(offer.isAssigned()){
            System.out.println("\nOffer already assigned to a diffferent order");
        }
        else{

            this.offer=offer;
        }
    }

    public double calculatePayableTotal(){
        return (itemTotal-itemTotal*(offer.getDiscountOffer()/100.0));
    }

    public void cancelOrder(){
        System.out.println("\nOrder has been cancelled");
    }

    public void displayOrder(){
        System.out.println(orderId+" | "+customerName+" | "+calculatePayableTotal()+" | "+offer.getOfferId());
    }

    public static int getOrderCount(){
        return orderCount;
    }
}
