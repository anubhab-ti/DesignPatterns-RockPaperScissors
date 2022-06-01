package RockPaperScissors;

import java.util.Random;

public class RandomMove implements MoveType {
    Random random;
    private RandomMove() {
        random = new Random();
    }
    private static RandomMove instance;

    public static RandomMove getInstance() {
        if (instance == null) instance = new RandomMove();
        return instance;
    }
    public int move(int player, MoveList moveList) {
        int t = random.nextInt(3);
        return t;
    }
}
