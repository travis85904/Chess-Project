package chess;

public class Bishop extends ChessPiece {
    public Bishop(Color color) {
        super(color);
    }

    @Override
    public boolean legalMove(ChessPiece[][] board, int locX, int locY, int movX, int movY) {
        return true;
    }

    @Override
    public boolean checkPath(ChessPiece[][] board, int locX, int locY, int movX, int movY) throws Exception {
        if(movX>locX){
            if (movY>locY){

            } else if (movX>locX){

            }
        }
        return false;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "B" : "b";
    }
}
