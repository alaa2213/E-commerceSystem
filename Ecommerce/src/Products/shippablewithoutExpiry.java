package Products;

public class shippablewithoutExpiry extends Product implements shippable {

	private double weight;

	public shippablewithoutExpiry(String name, double price, int quantity, double weight) {
		super(name, price, quantity);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "ShippableWithoutExpiry{" +
				"name='" + this.getName() + '\'' +
				", price=" + this.getPrice() +
				", quantity=" + this.getQuantity() +
				", weight=" + weight +
				'}';
	}

	@Override
	public double getWeight() {
		return weight;
	}

}
