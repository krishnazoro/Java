package method;

public class NstNpNr {
	String name;
	int age;
	
	void display() {
		System.out.println(name);
		System.out.println(age);
		
	}
	
	public static void main(String[] args) {
		NstNpNr n1 = new NstNpNr();
		
		n1.name = "Krishna";
		n1.age = 23;
		
		n1.display();
	}

}
