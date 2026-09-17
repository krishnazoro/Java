package method;
import java.util.*;
public class StaticTest {
	static boolean isEligible(int age) {
		if(age >= 18) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age: ");
		int vayasu = sc.nextInt();
		
		boolean result = isEligible(vayasu);
		
		if(result) {
			System.out.println("You are eligible vote");
		
		}
		else {
			System.out.println("You are nnot eligible vote");
		}
		
		
		sc.close();
	}

}
