package RockPaperScissors;

public class MirrorMove implements MoveType {
    private static MirrorMove instance;

    private MirrorMove() {
        
    }

    public static MirrorMove getInstance() {
        if (instance == null) instance = new MirrorMove();
        return instance;
    }

    public int move(int player, MoveList moveList) {
        int t = moveList.getLastMove(player ^ 1);
        assert(t != -1);
        return t;
    }
}
