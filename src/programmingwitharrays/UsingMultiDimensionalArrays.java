package programmingwitharrays;

public class UsingMultiDimensionalArrays {

	public static void main(String[] args) {
		int[][] grid = {{1,2},{3,4}};
		System.out.println(grid[0][0] + " " + grid[1][0]);
		System.out.println(grid[0][1] + " " + grid[1][1]);
		
		int[] subGrid = grid[1];
	}

}
