package Labs.Week6.Tasks.Task6;
import Labs.Week6.Tasks.Task6.Packages.*;

public class Main {
    
    public static void main(String[] args) {
        RestaurantOffer offer1=new RestaurantOffer("OFF-1", "ABC");
        RestaurantOffer offer2=new RestaurantOffer("OFF-2", "ABC");

        offer1.setDiscountPercent(10);
        offer1.displayOffer();
        
        FoodOrder order1=new FoodOrder("ORD-501","Ali Hassan",1450,true);
        FoodOrder order2=new FoodOrder("ORD-502","Farhan",900,true);
        
        order1.assignOffer(offer1);
        offer1.markAssigned();
        offer1.displayOffer();

        offer2.setDiscountPercent(20);
        order2.assignOffer(offer2);
        offer2.markAssigned();

        order1.displayOrder();
        order2.displayOrder();

        order1.assignOffer(offer2);

        System.out.println(FoodOrder.getOrderCount());

    }
}
