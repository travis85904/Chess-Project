package chess;

public class Queen extends ChessPiece {
    public Queen(Color color) {
        super(color);
    }
    @Override
    public boolean legalMove(String movStr, ChessPiece[][] board) {
        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "Q" : "q";
    }
}
