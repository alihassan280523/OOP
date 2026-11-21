import Packages.*;

public class Main{

    public static void main(String[] args) {
        
        SubscriptionPlan plan=new SubscriptionPlan("P-1", "Standard", 1200);

        plan.activateSubscription();
        plan.startViewing("V-1", "Interstellar", 169);
        plan.startViewing("V-2", "Inception", 148);

        plan.pauseViewing("V-1", 42);
        // plan.pauseViewing("V-2", 300);
        System.out.println(plan.remainingMinutes("V-1"));
        System.out.println(plan.remainingMinutes("V-2"));

        plan.displayViewings();
        System.out.println("\nRecord count: "+plan.getRecordCount());
        plan.cancelPlan();
        System.out.println("\nRecord count: "+plan.getRecordCount());
        plan.startViewing("V-1", "Interstellar", 169);
    }
}