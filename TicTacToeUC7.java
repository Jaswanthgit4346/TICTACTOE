import java.util.Random;

public class TicTacToeUC7 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        computerMove('O');
        printBoard();
    }

    // UC7: Computer random move
    static void computerMove(char symbol) {
        Random rand = new Random();
        int row, col;

        while (true) {
            int slot = rand.nextInt(9) + 1; // 1–9

            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            if (board[row][col] == '\0') {
                board[row][col] = symbol;
                break;
            }
        }
    }

    // helper to display board (for testing)
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}