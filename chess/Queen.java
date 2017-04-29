package chess;

public class Queen extends ChessPiece {
    public Queen(Color color) {
        super(color);
    }
    @Override
    public boolean legalMove(ChessPiece[][] board, int[] locationAry, int[] moveAry) {
        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "Q" : "q";
    }
}
