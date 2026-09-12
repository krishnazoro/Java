package loops;

public class NestedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 3; i++) {       // controls rows

		    for (int j = 1; j <= 4; j++) {   // controls numbers

		        System.out.print(j + " ");
		    }

		    System.out.println();             // next row
		}
	}

}
