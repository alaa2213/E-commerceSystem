package Products;

import java.time.LocalDate;
import java.util.Date;

public class test {
	public static void main(String[] args) {
Product cheese= new shippableProductwithExpiry("Cheese", 5.99,5,0.2, LocalDate.of(2025, 7, 19));
Product bread= new nonShippableProductwithExpiry("Bread", 2.99,10, LocalDate.of(2023, 10, 1));
Product tv= new shippablewithoutExpiry("TV", 499.99,2,10.5);
Product scratchCard= new Product("Scratch Card", 10.00,10);

Customer c=new Customer("alix",2000);
Customer c2=new Customer("bob",100);
Cart cart2=c2.getCart();
cart2.add(cheese,1);
cart2.add(tv, 1); 
System.out.println("shipment service for bob: ");

ShippingService.shipItems(cart2.getShippableProducts());

System.out.println("--------------------");

Customer.checkout(c2, cart2);
System.out.println("--------------------");

Cart cart=c.getCart();
cart.add(cheese,2);
cart.add(tv, 1); 
cart.add(scratchCard, 1); 
cart.add(bread, 1); 

System.out.println("shipment service for alix: ");

ShippingService.shipItems(cart.getShippableProducts());

System.out.println("--------------------");

Customer.checkout(c, cart);

}
}
