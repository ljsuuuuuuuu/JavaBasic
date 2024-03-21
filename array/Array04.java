package array;

public class Array04 {
	public static void main(String[] args) {
		int rows = 2, columns = 3;
		int[][] firstMatrix = { { 2, 3, 4 }, { 3, 2, 1 } };
		int[][] secondMatrix = { { 1, 2, 3 }, { -4, -2, 1 } };
		int[][] sum = new int[rows][columns];
		
		for(int i = 0; i < firstMatrix.length; i += 1) {
			for(int j = 0; j < firstMatrix[i].length; j += 1) {
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}
		System.out.println("두 행렬의 합 : ");
		for(int i = 0; i < firstMatrix.length; i += 1) {
			for(int j = 0; j < firstMatrix[i].length; j += 1) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
}
