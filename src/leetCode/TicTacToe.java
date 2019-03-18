package leetCode;

public class TicTacToe {
	public static void main(String[] args) {
		String[] board = new String[]{"XXX", "   ", "OOO"};
		
		int numX = 0;
		int numO = 0;
		
		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board[i].length(); ++j) {
				System.out.print(board[i].charAt(j));
			}
			System.out.println();
		}
	}
	
    public static boolean validTicTacToe(String[] board) {
        return false;
    }
}