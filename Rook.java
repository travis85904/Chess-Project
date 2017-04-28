// rook == castle

public class Rook extends ChessPiece {
    public Rook(Color color) {
        super(color);
    }

    public boolean legalMove(String moveStr, ChessBoard[][] boards) {


        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "R" : "r";
    }

}
