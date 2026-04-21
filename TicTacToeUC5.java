public class TicTacToeUC5 {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    // UC5: validate move
    public static boolean isValidMove(int row, int col) {

        // 1. boundary check
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid move: Out of bounds");
            return false;
        }

        // 2. cell check
        if (board[row][col] != ' ') {
            System.out.println("Invalid move: Cell already occupied");
            return false;
        }

        return true;
    }

    // place move if valid
    public static void makeMove(int row, int col, char player) {
        if (isValidMove(row, col)) {
            board[row][col] = player;
            System.out.println("Move accepted");
        } else {
            System.out.println("Move rejected");
        }
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + "|" + board[i][1] + "|" + board[i][2]);
        }
    }

    public static void main(String[] args) {
        makeMove(0, 0, 'X');
        makeMove(0, 0, 'O'); // invalid
        makeMove(3, 3, 'X'); // invalid
        printBoard();
    }
}