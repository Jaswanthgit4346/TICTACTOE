public class TicTacToeUC10 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        // sample test (fill board fully)
        char ch = 'X';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ch;
                ch = (ch == 'X') ? 'O' : 'X';
            }
        }

        if (isDraw()) {
            System.out.println("Game is a Draw!");
        } else {
            System.out.println("Game not finished");
        }
    }

    // UC10: Detect draw
    static boolean isDraw() {

        // Check for any empty cell
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '\0') {
                    return false; // move still possible
                }
            }
        }

        // No empty cells → draw
        return true;
    }
}