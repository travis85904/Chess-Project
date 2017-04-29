
package chess;

public abstract class ChessPiece {
    protected Color color;

    public ChessPiece() {

    }

    public ChessPiece(Color color) {
        this.color = color;
    }

    void move(ChessPiece[][] board, int[][]currentPosition, int[][] desiredPosition) {

    }

    //public abstract boolean legalMove(String movStr, ChessPiece[][] board);
    public abstract boolean legalMove(ChessPiece[][] board, int[] locationAry, int[] moveAry);

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
