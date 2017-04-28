package chess;

public class Pawn extends ChessPiece {
    public Pawn(Color color) {
        super(color);
    }

    @Override
    public boolean legalMove(String movStr, ChessPiece[][] board) {
        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "P" : "p";
    }
}
