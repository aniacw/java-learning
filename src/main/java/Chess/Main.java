package Chess;

public class Main {
    public static void main(String[] args){

        Knight knight = new Knight();
        Position nextMove = new Position(4,1);

        if(knight.isValidMove(nextMove)){
            System.out.println("Valid move - go ahead!");
        } else {
            System.out.println("Sorry, the move is out of bound!");
        }

        knight.setValue(3,4);

    }
}
