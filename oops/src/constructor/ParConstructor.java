package constructor;

public class ParConstructor {
	
		String name;
		int age;

	ParConstructor(String name, int age){
		this.age = age;
		this.name = name;
		
	}
		void display() {
			System.out.println(name);
			System.out.println(age);

 }
}