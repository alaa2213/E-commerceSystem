package Products;

import java.time.LocalDate;

public class nonShippableProductwithExpiry extends Product implements expiryDate {
	private LocalDate expiryDate;

	public nonShippableProductwithExpiry(String name, double price, int quantity,LocalDate expiryDate) {
		super(name, price, quantity);
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "NonShippableProduct{" +
				"name='" + this.getName() + '\'' +
				", price=" + this.getPrice() +
				", quantity=" + this.getQuantity() +
				'}';
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
   	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
   	public boolean isExpired() {
   	if(expiryDate.isBefore(LocalDate.now())) {
   		return true;
   	} else {
   		return false;
   	}
}
}
