package chess;

public class Knight extends ChessPiece {
    public Knight(Color color){
        super(color);
    }
    @Override
    public boolean legalMove(ChessPiece[][] board, int locX, int locY, int movX, int movY) {
        return true;
    }

    @Override
    public boolean checkPath(ChessPiece[][] board, int locX, int locY, int movX, int movY) throws Exception {
        return false;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "K" : "k";
    }
}
