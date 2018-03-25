package Chess;

public class Game {

    private Piece[][] board;

    public Game(int x, int y) {
        board = new Piece[x = 7][y = 7];
    }

    public Piece[][] getBoard() {
        return board;
    }
}
