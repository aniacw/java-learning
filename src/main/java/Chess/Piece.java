package Chess;

public class Piece {
    private Position position;
    Position currentPosition = new Position();

    boolean isValidMove(Position newPosition) {
        if (newPosition.getRow() > 0 && newPosition.getColumn() > 0 && newPosition.getRow() <= 8 && newPosition.getColumn() <= 8) {
            return true;
        } else {
            return false;
        }
    }

    public Position getPosition() {
        return position;
    }

    private int x; //row
    private int y; //column

    public void setValue(int x, int y) {
        if (x >= 0 && x < 8 && y >= 0 && y < 8) {
            this.x = x;
            this.y = y;
        }
    }
}
