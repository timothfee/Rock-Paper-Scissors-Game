import java.util.Scanner;

public class RockPaperScissors {

    public static String getMove(String player) {
        Scanner scanner = new Scanner(System.in);
        String move;

        while (true) {
            System.out.print("Enter move for " + player + " (R, P, S): ");
            move = scanner.nextLine();

            if (move.equalsIgnoreCase("R") || move.equalsIgnoreCase("P") || move.equalsIgnoreCase("S")) {
                return move.toLowerCase();             
            }

            System.out.println("Invalid move. Please enter R, P, or S.");
        }
    }

    public static String results(String moveA, String moveB) {
        if (moveA.equals(moveB)) {
            return "Both players chose " + moveA.toUpperCase() + ", it's a tie.";
        }

        switch (moveA + moveB) {
            case "rs":
                return "Rock beats Scissors. Player A wins!";
            case "pr":
                return "Paper beats Rock. Player A wins!";
            case "sp":
                return "Scissors beats Paper. Player A wins!";
            case "sr":
                return "Rock beats Scissors. Player B wins!";
            case "rp":
                return "Paper beats Rock. Player B wins!";
            case "ps":
                return "Scissors beats Paper. Player B wins!";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rematch;

        do {
            String moveA = getMove("Player A");
            String moveB = getMove("Player B");

            System.out.println(results(moveA, moveB));

            System.out.print("Do you want to play again? [Y/N]: ");
            rematch = scanner.nextLine();

        } while (rematch.equalsIgnoreCase("y"));
    }
}

