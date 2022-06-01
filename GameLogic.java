package RockPaperScissors;

public final class GameLogic {
    /*
        Implemented as a singleton class
        0 : Rock
        1 : Scissors
        2 : Paper
        gameMatrix[i][j] =  0 if player 1 wins
                         =  1 if player 2 wins
                         = -1 if both play same move
    */
    private static GameLogic instance;
    private static final int[][] gameMatrix = {
        {-1, 0, 1},
        {1, -1, 0},
        {0, 1, -1}
    };
    private GameLogic() {
        ;
    }
    public static GameLogic getInstance() {
        if (instance == null) instance = new GameLogic();
        return instance;
    }

    public int getWinner(int a, int b) {
        assert(a >= 0 && a < 3);
        assert(b >= 0 && b < 3);
        return gameMatrix[a][b];
    }
}