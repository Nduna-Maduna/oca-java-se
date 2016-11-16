package programmingwitharrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		char[][] ticTacToeBoard = new char[3][3];
		
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				ticTacToeBoard[x][y]='-';
			}
		}
		
		ticTacToeBoard[0][0] = 'X';
		ticTacToeBoard[1][1] = 'O';
		ticTacToeBoard[0][2] = 'X';
		
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				System.out.print(ticTacToeBoard[x][y] + " ");
			}
			System.out.print("\n");
		}
		
	}

}
