package RockPaperScissors;

import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Initialise players and game logic
        Player[] players = new Player[2];
        MoveList moveList = new MoveList();
        for (int i = 0; i < 2; ++i) {
            players[i] = new Player(moveList, i);
        }
        GameLogic gameLogic = GameLogic.getInstance();

        // Create a rng for updating move types

        Random random = new Random();

        // Map from number to move name

        String[] moveNames = {
            "Rock",
            "Scissors",
            "Paper"
        };

        // First to score 5 wins

        while (true) {
            // Make moves and update score of winner
            int t0 = players[0].performMove();
            int t1 = players[1].performMove();

            // System.out.println("Player 1 played: " + moveNames[t0] + " and Player 2 played: " + moveNames[t1]);
            System.out.println("Moves played: [" + moveNames[t0] + ", " + moveNames[t1] + "]");
            int w = gameLogic.getWinner(t0, t1);
            if (w != -1) players[w].updateScore(1);

            System.out.println("Scores: [" + players[0].getScore() + ", " + players[1].getScore() + "]");
            // Check if someone has won the match
            if (players[0].getScore() == 5) {
                System.out.println("Player 1 won!");
                break;
            } else if (players[1].getScore() == 5) {
                System.out.println("Player 2 won!");
                break;
            }

            // Update move types
            int r0 = random.nextInt(2);
            int r1 = random.nextInt(2);

            if (r0 == 0) players[0].setMoveType(RandomMove.getInstance());
            else players[0].setMoveType(MirrorMove.getInstance());

            if (r1 == 0) players[1].setMoveType(RandomMove.getInstance());
            else players[1].setMoveType(MirrorMove.getInstance());
        }

    }
}
