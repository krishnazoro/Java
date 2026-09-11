package loops;
import java.util.*;
public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		for(int i=0; i >= num; i++) {
			
			if(i % 2 == 0) {
				System.out.println(i);
			}
		
		}
		sc.close();
		
	}

}
