package Products;

import java.time.LocalDate;

public class shippableProductwithExpiry extends Product implements shippable,expiryDate {
	private double weight;
	private LocalDate expiryDate;
	
	

	public shippableProductwithExpiry(String name, double price, int quantity, double weight,LocalDate expiryDate) {
		super(name, price, quantity);
		this.weight = weight;
		this.expiryDate = expiryDate;
	}

	@Override
	public double getWeight() {
		return weight;
	}
	public boolean isExpired() {
	   	if(expiryDate.isBefore(LocalDate.now())) {
	   		return true;
	   	} else {
	   		return false;
	   	}
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getName() {
		return super.getName();
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "ShippableProduct{" +
				"name='" + this.getName() + '\'' +
				", price=" + this.getPrice() +
				", quantity=" + this.getQuantity() +
				", weight=" + weight +
				'}';
	}

}
