package Example;
public class AverageCalculator {
  public static int checkForDiagonalWin(String[][] board, String player) {
      int diagonalNumber = 0;
      // Check main diagonal
      if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) {
          diagonalNumber = 1;
      }
      // Check anti-diagonal
      else if (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)) {
          diagonalNumber = 2;
      }
      return diagonalNumber;
  }

  public static void main(String[] args) {
      // Example usage
      String[][] board = {
          {"X", " ", "O"},
          {" ", "X", " "},
          {"O", " ", "X"}
      };
      String player = "X"; // Example player
      int win = checkForDiagonalWin(board, player);
      if (win > 0) {
          System.out.println("Player " + player + " wins on diagonal " + win);
      } else {
          System.out.println("No diagonal win for player " + player);
      }
  }
}

  

