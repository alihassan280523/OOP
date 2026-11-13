package Packages;

public class Order {
    private final String orderId;
    private String customerName;
    private double itemTotal;
    private String status;
    private RestaurantOffer offer;
    private double payableTotal;
    private static int orderCount;

    static{
        orderCount=0;
    }

    public Order(String id,String name,double total){
        this.orderId=id;
        this.customerName=name;
        this.itemTotal=total;
        this.status="Placed";
        this.offer=null;
        this.payableTotal=calculatePayableTotal();
        Order.orderCount++;
    }


    public void assignOffer(RestaurantOffer offer){
        if(this.offer!=null){
            System.out.println("\noffer already assigned to this order\n");
            return;
        }

        this.offer=offer;
        offer.markAssigned();
        System.out.println("\nOffer assigned\n");
    }

    public double calculatePayableTotal(){
        if(offer==null){
            return itemTotal;
        }

        payableTotal= (itemTotal-(itemTotal*(offer.getDiscountPercent()/100.0)));
        return payableTotal;
    }

    public void cancelOrder(){
        if(status.compareTo("Dispatched")==0||status.compareTo("Delivered")==0){
            System.out.println("\nOrder can not be cancelled\n");
            return;
        }

        if(status.compareTo("Cancelled")==0){
            System.out.println("\nOrder already canclled\n");
            return;
        }
        status="cancelled";
        System.out.println("\nOrder cancelled!\n");
    }

    public void displayOrder(){
        System.out.println(orderId+" | "+customerName+" | "+itemTotal+" | "+((offer!=null)? offer.getDiscountPercent():0)+" | "+calculatePayableTotal()+" | "+status);
    }


    public static int getOrderCount(){
        return orderCount;
    }
}
