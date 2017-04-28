public class Knight extends ChessPiece {
    public Knight(Color color){
        super(color);
    }
    public boolean legalMove(String moveStr, ChessBoard[][] boards){
        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "K" : "k";
    }
}
