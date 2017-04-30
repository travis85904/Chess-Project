
package chess;

public abstract class ChessPiece {
    protected Color color;

    public ChessPiece() {

    }

    public ChessPiece(Color color) {
        this.color = color;
    }

    public abstract boolean legalMove(ChessPiece[][] board, int locX, int locY, int movX, int movY) throws Exception;

    //public abstract void capture(){};

    public abstract boolean checkPath(ChessPiece[][] board, int locX, int locY, int movX, int movY) throws Exception;

//    boolean parseMove(String mv) {
//        return true;
//    }

    @Override
    public String toString() {
        if (color == null)
            return ".";
        return super.toString();
    }
}
