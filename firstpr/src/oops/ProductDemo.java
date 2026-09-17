package oops;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(100 , "apple", 2000, 4);
		Product p2 = new Product(102 , "mobile", 20000, 1);
		Product p3 = new Product(104 , "chocolate", 5000, 10);
		
		p1.display();
		p1.calculateBill();
		
		System.out.println();
		
		p2.display();
		p2.calculateBill();
		
		System.out.println();
		
		p3.display();
		p3.calculateBill();
		
		}

}
