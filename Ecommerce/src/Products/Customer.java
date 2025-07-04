package Products;

public class Customer {
	private Cart cart;
	private double balance;
	String name;
	public Customer(String name, double balance) {
		this.name = name;
		this.balance = balance;
		this.cart = new Cart();
	}
	public String getName() {
		return name;
	}
	public  Cart getCart() {
		return this.cart;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static void checkout(Customer customer, Cart cart) {
		double total = cart.getCartTotal();
		System.out.println("Checking out for " + customer.getName());
		if(cart.isEmpty()) {
			System.out.println("Cart is empty. Please add items to the cart before checkout.");
			return;
		}
		if (total > customer.balance) {
			System.out.println("Insufficient balance for checkout.");
		}
		else {
			
			System.out.println("Cart subtotal " + total);
			double shippingCost = cart.calcShippingCost();
			System.out.println("Shipping cost: " + shippingCost);
			total += shippingCost;
			System.out.println("Total amount to be paid: " + total);
			customer.setBalance(customer.balance - total);
			cart.clear();
			System.out.println("Remaining balance after payment: " + customer.balance);
		}
	}
	

}
