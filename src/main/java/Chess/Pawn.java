package Chess;

public class Pawn extends Piece {
    int counter = 0;

    public boolean isValidMove(Position newPosition){
        if(!super.isValidMove(getPosition())){
            return false;
        }
        if(counter==0){
            if(Math.abs(newPosition.getRow() - currentPosition.getRow()) <=2 &&Math.abs(newPosition.getRow() - currentPosition.getRow()) >= 1
                    && Math.abs(newPosition.getColumn() - currentPosition.getColumn()) == 0)
                counter++;
        }
        if(counter>0){
            if(Math.abs(newPosition.getRow() - currentPosition.getRow()) ==1 && Math.abs(newPosition.getColumn() - currentPosition.getColumn()) == 0) {
                System.out.println("Pawn is now at file: " + newPosition);
            return true;
        }
        } else {
        }
        return false;
    }
}
