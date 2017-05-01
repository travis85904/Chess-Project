// rook = castle
package chess;

public class Rook extends ChessPiece {
    public Rook(Color color) {
        super(color);
    }

    @Override
    public boolean legalMove(ChessPiece[][] board, int locX, int locY, int movX, int movY) throws Exception {

        if (locX != movX && locY != movY)//checks that the rook is only moving along 1 axis
            throw new Exception("Rooks can only move along 1 axis per move");

        checkPath(board, locX, locY, movX, movY);

        return true;

    }

    public boolean checkPath(ChessPiece[][] board, int locX, int locY, int movX, int movY) throws Exception {
        if (locY == movY) {
            if (locX > movX) {
                for (int i = (locX - 1); i > movX; i--) {
                    if (board[i][locY] != null) {
                        throw new Exception("There is a piece in your path at array location " + i + "," + locY);
                    }
                }
            } else if (locX < movX) {
                for (int i = (locX + 1); i < movX; i++) {
                    if (board[i][locY] != null) {
                        throw new Exception("There is a piece in your path at array location " + i + "," + locY);
                    }
                }
            }
        } else if (locX == movX) {
            if (locY > movY) {
                for (int i = (locY - 1); i > movY; i--) {
                    if (board[locX][i] != null) {
                        throw new Exception("There is a piece in your path at array location " + locX + "," + i);
                    }
                }
            } else if (locY < movY) {
                for (int i = (locY + 1); i < movY; i++) {
                    if (board[locX][i] != null) {
                        throw new Exception("There is a piece in your path at array location " + locX + "," + i);
                    }
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "R" : "r";
    }
}
