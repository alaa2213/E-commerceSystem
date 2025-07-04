package Products;

import java.util.List;

public class ShippingService {
    public static void shipItems(List<shippable> items) {
    	double weight=0.0;
        System.out.println("Shipping the following items :");
        for (shippable item : items) {
            System.out.println("- " + item.getName() + " (" + item.getWeight() + " kg)");
            weight+=item.getWeight();
        }
        System.out.println("Total Weight: "+ weight +"kg");
        
    }
}
