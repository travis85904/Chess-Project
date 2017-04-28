public class Queen extends ChessPiece {
    public Queen(Color color) {
        super(color);
    }
    public boolean legalMove(String moveStr, ChessBoard[][] boards){
        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "Q" : "q";
    }
}
