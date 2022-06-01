package RockPaperScissors;

import java.util.ArrayList;

public class MoveList {
    private ArrayList<ArrayList<Integer>> playerMoves = new ArrayList<>();
    MoveList() {
        for (int i = 0; i < 2; ++i) playerMoves.add(new ArrayList<Integer>());
    }
    public void addMove(int player, int move) {
        playerMoves.get(player).add(move);
    }
    public int getLastMove(int player) {
        if (playerMoves.get(player).isEmpty()) return -1;
        int sz = playerMoves.get(player).size();
        return playerMoves.get(player).get(sz - 1);
    }
}
