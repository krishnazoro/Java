package firstpr;

public class RefrenceType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(5, 7);
		Point p2 = p1;
		
		System.out.println(p2);
		
		p1.x=7;
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
