package chess;

public class Pawn extends ChessPiece {
    public Pawn(Color color) {
        super(color);
    }

    @Override
    public boolean checkPath(ChessPiece[][] board, int locX, int locY, int movX, int movY) throws Exception {
        return false;
    }

    @Override
    public boolean legalMove(ChessPiece[][] board, int locX, int locY, int movX, int movY) {

        return false;
    }



    @Override
    public String toString() {
        return (color == Color.white) ? "P" : "p";
    }
}
