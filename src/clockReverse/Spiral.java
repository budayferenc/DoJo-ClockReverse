package clockReverse;

public class Spiral {
	public int N;

	public static int[][] createSpiral(int N) {
		int[][] matrix = new int[N][N];

		if (N < 1) {
			return matrix;
		}
		else {
			for (int i = 1; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					System.out.println(matrix);
				}
			}
		}
		return matrix;
	}

	public static void main(String[] args) {
		createSpiral(3);
	}
}