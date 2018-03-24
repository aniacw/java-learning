package Chess;

public class Bishop extends Piece {

    public boolean isValidMove(Position newPosition){
        if(!super.isValidMove(getPosition())){
            return false;
        }
        if(Math.abs(newPosition.getColumn() - currentPosition.getColumn()) == Math.abs(newPosition.getRow() - currentPosition.getRow())){
            System.out.println("Bishop is now at file: " + newPosition);
            return true;
        } else {
            return false;
        }
    }
}
