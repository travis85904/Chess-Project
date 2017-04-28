package chess;

public class King extends ChessPiece {
    public King(Color color){
        super(color);
    }
    @Override
    public boolean legalMove(String movStr, ChessPiece[][] board) {
        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "K" : "k";
    }
}
