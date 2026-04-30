import java.util.Random;

public class TicTacToeUC8 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        playGame();
    }

    // UC8: Game loop
    static void playGame() {
        char currentPlayer = 'X';
        boolean gameOver = false;

        while (!gameOver) {

            // Computer random move (reuse UC7 logic)
            makeMove(currentPlayer);

            printBoard();

            // Check win
            if (checkWin(currentPlayer)) {
                System.out.println(currentPlayer + " wins!");
                gameOver = true;
            }
            // Check draw
            else if (isBoardFull()) {
                System.out.println("Game Draw!");
                gameOver = true;
            }
            // Switch player
            else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    // Random move (reuse logic)
    static void makeMove(char symbol) {
        Random rand = new Random();
        int row, col;

        while (true) {
            int slot = rand.nextInt(9) + 1;
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            if (board[row][col] == '\0') {
                board[row][col] = symbol;
                break;
            }
        }
    }

    // Check win
    static boolean checkWin(char s) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == s && board[i][1] == s && board[i][2] == s)
                return true;
            if (board[0][i] == s && board[1][i] == s && board[2][i] == s)
                return true;
        }
        if (board[0][0] == s && board[1][1] == s && board[2][2] == s)
            return true;
        if (board[0][2] == s && board[1][1] == s && board[2][0] == s)
            return true;

        return false;
    }

    // Check draw
    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == '\0')
                    return false;

        return true;
    }

    // Display board
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}