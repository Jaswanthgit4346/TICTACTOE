import java.util.Random;

class TicTacToeUC2 {
    public static void main(String[] args) {

        Random rand = new Random();

        // Toss: 0 or 1
        int toss = rand.nextInt(2);

        char userSymbol;
        char computerSymbol;
        String firstPlayer;

        if (toss == 0) {
            userSymbol = 'X';
            computerSymbol = 'O';
            firstPlayer = "User";
        } else {
            userSymbol = 'O';
            computerSymbol = 'X';
            firstPlayer = "Computer";
        }

        // Display results
        System.out.println("Toss Result:");
        System.out.println(firstPlayer + " plays first");

        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}