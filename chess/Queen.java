package chess;

public class Queen extends ChessPiece {
    public Queen(Color color) {
        super(color);
    }

    @Override
    public boolean checkPath(ChessPiece[][] board, int locX, int locY, int movX, int movY) throws Exception {
        return false;
    }

    @Override
    public boolean legalMove(ChessPiece[][] board, int locX, int locY, int movX, int movY) {
        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "Q" : "q";
    }
}
