package Chess;

public class Knight extends Piece {

    public boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(getPosition())) {
            return false;
        }
        if (Math.abs(newPosition.getRow() - currentPosition.getRow()) == 1 && Math.abs(newPosition.getColumn() - currentPosition.getColumn()) == 2) {
            return true;
        }
        if (Math.abs(newPosition.getRow() - currentPosition.getRow()) == 2 && Math.abs(newPosition.getColumn() - currentPosition.getColumn()) == 1) {
            System.out.println("Knight is now at file: " + newPosition);
            return true;
        } else {
            return false;
        }
    }
}
