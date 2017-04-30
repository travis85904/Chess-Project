package chess;

public class Pawn extends ChessPiece {
    public Pawn(Color color) {
        super(color);
    }

    @Override
    public boolean legalMove(ChessPiece[][] board, int[] locationAry, int[] moveAry) {

        return false;
    }



    @Override
    public String toString() {
        return (color == Color.white) ? "P" : "p";
    }
}
