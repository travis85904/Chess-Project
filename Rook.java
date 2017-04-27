import java.util.Random;

public class Rook extends ChessPiece {
    public Rook(Color color){
        super(color);

    }

    public boolean legalMove(String moveStr, ChessBoard[][] boards){
        return true;
    }

    @Override
    public String toString() {
        if (super.getColor().equals(Color.white))
            return "R";
        else if (super.getColor().equals(Color.black))
            return "r";
        return ".";
    }
}
