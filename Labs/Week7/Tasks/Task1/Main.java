import Packages.*;

public class Main {
    public static void main(String[] args) {
        
        RestaurantOffer offer1=new RestaurantOffer("OFF-1", "", 10);
        RestaurantOffer offer2=new RestaurantOffer("OFF-2", "", 20);

        offer1.displayOffer();
        offer2.displayOffer();

        Order hamza=new Order("ORD-501","Hamza",1450);

        hamza.displayOrder();

        Order ayesha=new Order("ORD-502","Ayehsa",900);
        ayesha.displayOrder();

        hamza.assignOffer(offer1);
        ayesha.assignOffer(offer2);

        hamza.displayOrder();
        ayesha.displayOrder();

        hamza.assignOffer(offer2);

        System.out.println(Order.getOrderCount());

    }
}
