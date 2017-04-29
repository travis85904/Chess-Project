package chess;

public class King extends ChessPiece {
    public King(Color color) {
        super(color);
    }

    @Override
    public boolean legalMove(ChessPiece[][] board, int[] locationAry, int[] moveAry) {
        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "K" : "k";
    }
}
