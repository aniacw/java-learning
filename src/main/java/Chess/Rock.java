package Chess;

public class Rock extends Piece {

    public boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(getPosition())) {
            return false;
        }
        if (newPosition.getColumn() == currentPosition.getColumn() || newPosition.getRow() == currentPosition.getRow()) {
            System.out.println("Rock is now at file: " + newPosition);
            return true;
        } else {
            return false;
        }
    }
}
