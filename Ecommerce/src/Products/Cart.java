package Products;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Product> products=new ArrayList<>();
	private int productCount;
    private double carttotal;
	public Cart() {
		
		productCount = 0;
		carttotal = 0;
	}

	public void add(Product product, int quantity) {
	  
	    if (product instanceof expiryDate) {
	        if (((expiryDate) product).isExpired()) {
	            System.out.println("Product " + product.getName() + " is expired and cannot be added to the cart.");
	            return;
	        }
	    }

	    if (product.getQuantity() >= quantity) {
	        product.setQuantity(product.getQuantity() - quantity);
	        products.add(product);
	        productCount++;
	        carttotal += product.getPrice() * quantity;
	        System.out.println("Product added to cart: " + product.getName() + " x " + quantity  +" , price: " + product.getPrice() * quantity);
	    } else {
	        System.out.println("Not enough stock for " + product.getName());
	    }
	}

	public boolean isEmpty() {
		return productCount == 0;
	}
	public double calcShippingCost() {
		double shippingCost = 0;
		for (Product product : products) {
			if (product instanceof shippable) {
				shippingCost += ((shippable) product).getWeight() * 10;// Assuming a shipping cost of $10 per kg 
			}
		}
		return shippingCost;
	}
public void clear() {
		products.clear();
		productCount = 0;
		carttotal = 0;
		
	}
	public void displayCart() {
		for (int i = 0; i < productCount; i++) {
			System.out.println(products.get(i).toString());
		}
	}
	public List<Product> getProducts() {
		return products;
	}
	public List<shippable> getShippableProducts() {
		List<shippable> shippableItems = new ArrayList<>();
		for (Product product : this.getProducts()) {
			if (product instanceof shippable) {
				shippableItems.add((shippable) product);
			}
		}
		return shippableItems;
	}

	public int getProductCount() {
		return productCount;
	}
	public double getCartTotal() {
		return carttotal;
	}
	public void setCartTotal(double carttotal) {
		this.carttotal = carttotal;
	}
}
