package oops;

public class Product {
	
	int productId;
	String productName;
	int price;
	int quantity;
	
	Product(int productId, String productName, int price, int quantity){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	void display() {
		System.out.println("productId: " + productId);
		System.out.println("productName " + productName);
		System.out.println("price " + price);
		System.out.println("quantity " + quantity);
	}
	void calculateBill() {
		
		int total;
		int discount;
		int finalAmount;
		
		 total = price * quantity;		
		 
		if(total > 10000) {
			discount = total * 10/100;
		}
		else {
			discount = 0;
		}
		
		finalAmount = total - discount;
		
		System.out.println("total amount: " + total);
		System.out.println("discount: " + discount);
		System.out.println("final amount " + finalAmount);
		
		}
		
		
}
	
	
		
	


