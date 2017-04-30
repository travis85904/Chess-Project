
package chess;

public abstract class ChessPiece {
    protected Color color;

    public ChessPiece() {

    }

    public ChessPiece(Color color) {
        this.color = color;
    }

    public abstract boolean legalMove(ChessPiece[][] board, int[] locationAry, int[] moveAry) throws Exception;

    boolean parseMove(String mv) {
        return true;
    }

    @Override
    public String toString() {
        if (color == null)
            return ".";
        return super.toString();
    }
}
