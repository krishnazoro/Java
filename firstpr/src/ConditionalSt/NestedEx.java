package ConditionalSt;

public class NestedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		boolean voterId = false;
		
		if(age >= 18) {
			if(voterId == true) {
				
				System.out.println("He can vote");
			}
			else {
				System.out.println("He can't vote");
			}
		}
		

	}

}
