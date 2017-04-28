import sun.text.resources.ja.JavaTimeSupplementary_ja;

public class Bishop extends ChessPiece {
    public Bishop(Color color) {
        super(color);
    }

    public boolean legalMove(String moveStr, ChessBoard[][] boards){
        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "B" : "b";
    }
}
