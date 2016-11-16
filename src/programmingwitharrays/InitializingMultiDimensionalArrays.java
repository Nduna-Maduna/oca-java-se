package programmingwitharrays;

public class InitializingMultiDimensionalArrays {

	public static void main(String[] args) {
		String[][] square = {{"1","2"},{"3","4"}};
		String[][] square2 = new String[2][2];
		int[][][] cube = new int[3][3][2];
		
		int[][] oddSizeArray = {{1,2},{1,2,3,4},{1,2,3}};
		
		int[][][] array3D = new int[2][][];
		array3D[0] = new int[5][];
		array3D[1] = new int[3][];
		array3D[0][0] = new int[7];
		array3D[0][1] = new int[2];
		array3D[1][0] = new int[4];
	}

}
