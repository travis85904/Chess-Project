package chess;

public class Rook extends ChessPiece {
    public Rook(Color color) {
        super(color);
    }

    @Override
    public boolean legalMove(String movStr, ChessPiece[][] board) {
        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "R" : "r";
    }

}
