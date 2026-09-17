package oops;

public class ManagerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee.companyName = "ABC Company";
		
		Manager m1 = new Manager(101, "Rahul", 8000, "IT", 7);
		
		Manager m2 = new Manager(102, "Krishna", 20000, "Developer", 10);
		
		Manager m3 = new Manager(103, "Manik", 10000, "Finance", 5);
		
		
		m1.displayManger();
		m1.calculate();
		
		System.out.println();
		
		m2.displayManger();
		m2.calculate();

		System.out.println();
		
		m3.displayManger();
		m3.calculate();
		
	}

}
