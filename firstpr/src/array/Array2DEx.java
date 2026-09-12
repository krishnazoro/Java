package array;

public class Array2DEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[4][2];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[1][0] = 3;
		matrix[1][1] = 4;
		matrix[2][0] = 5;
		matrix[2][1] = 6;
		matrix[3][0] = 7;
		matrix[3][1] = 8;
		
		
		for(int i = 0; i <4; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}


		
		
	}

}
