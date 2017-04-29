// rook = castle
package chess;

public class Rook extends ChessPiece {
    public Rook(Color color) {
        super(color);
    }

    public void move(ChessPiece[][] board, int[][] currentPosition, int[][] desiredPosition) {
        super.move(board, currentPosition, desiredPosition);
    }

    @Override
    public boolean legalMove(ChessPiece[][] board, int[] locationAry, int[] moveAry) {
        int movX = moveAry[0];
        int movY = moveAry[1];
        int locX = locationAry[0];
        int locY = locationAry[1];

        //ChessPiece piece = chessBoard.getPiece(locationAry);

        if (movX == locX && movY == locY) {
            System.out.println("oops, your piece is already at that location!");
            return false;
        } else if (board[locX][locY] == null) {
            System.out.println("oops, there is no chess piece at that location!");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "R" : "r";
    }
}
