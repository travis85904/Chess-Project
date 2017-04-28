package chess;

public class Bishop extends ChessPiece {
    public Bishop(Color color) {
        super(color);
    }

    @Override
    public boolean legalMove(String movStr, ChessPiece[][] board) {

        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "B" : "b";
    }
}
