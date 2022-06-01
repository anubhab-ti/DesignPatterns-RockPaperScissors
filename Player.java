package RockPaperScissors;

public class Player {
    /*
        Both players are initialised with RandomMove as their move type for the first move.
        After each move is played, the move type is randomly updated to either random or mirror.
    */
    private int score, number;
    private MoveList moveList;
    private MoveType moveType;
    
    Player(MoveList _moveList, int _number) {
        moveList = _moveList;
        score = 0;
        moveType = RandomMove.getInstance();
        number = _number;
    }
    public void setMoveType(MoveType moveType) {
        this.moveType = moveType;
    }
    
    public int getScore() {
        return score;
    }

    public void updateScore(int add) {
        score += add;
    }

    public int performMove() {
        int t = moveType.move(number, moveList);
        moveList.addMove(number, t);
        return t;
    }
}
