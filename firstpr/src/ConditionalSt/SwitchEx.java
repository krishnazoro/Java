package ConditionalSt;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// In words
		
//		int day = 2;
//		
//		switch(day) {
//		
//		case 1:
//			System.out.println("Monday");
//			break;
//			
//		case 2:
//			System.out.println("Tuesday");
//			break;
//			
//		case 3:
//			System.out.println("Wednesday");
//			break;
//			
//		case 4:
//			System.out.println("Thursday");
//		}
		
		// In Mathamatical
		
		int num = 5;
		int choice = 2;

		switch (choice) {

		    case 1:
		        System.out.println("Square = " + (num * num));
		        break;

		    case 2:
		        System.out.println("Cube = " + (num * num * num));
		        break;

		    default:
		        System.out.println("Invalid choice");
		}
	}

}
