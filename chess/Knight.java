package chess;

public class Knight extends ChessPiece {
    public Knight(Color color){
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
