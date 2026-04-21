import java.util.Scanner;

public class TicTacToeUC4 {

    static Scanner sc = new Scanner(System.in);

    // Convert slot (1–9) to row index
    public static int getRow(int slot) {
        return (slot - 1) / 3;
    }

    // Convert slot (1–9) to column index
    public static int getCol(int slot) {
        return (slot - 1) % 3;
    }

    // Get user input
    public static int getUserMove() {
        System.out.print("Enter slot (1-9): ");
        return sc.nextInt();
    }

    public static void main(String[] args) {

        int slot = getUserMove();

        int row = getRow(slot);
        int col = getCol(slot);

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }
}