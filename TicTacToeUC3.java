import java.util.Scanner;

public class TicTacToeUC3 {

    static Scanner sc = new Scanner(System.in);

    // Method to get user input
    public static int getUserMove() {
        int slot;

        while (true) {
            System.out.print("Enter slot number (1-9): ");
            slot = sc.nextInt();

            if (slot >= 1 && slot <= 9) {
                break;
            } else {
                System.out.println("Invalid input! Please enter between 1 and 9.");
            }
        }

        return slot;
    }

    public static void main(String[] args) {
        int move = getUserMove();
        System.out.println("User selected slot: " + move);
    }
}