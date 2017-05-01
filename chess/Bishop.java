package chess;

public class Bishop extends ChessPiece {
    public Bishop(Color color) {
        super(color);
    }

    @Override
    public boolean legalMove(ChessPiece[][] board, int locX, int locY, int movX, int movY) throws Exception{
        if (movX > locX || movX < locX) {
            if (movY > locY || movY < locY) {
                if (Math.abs(movX - locX) == Math.abs(movY - locY)) {
                    return true;
                }
                if (Math.abs(movX - locX) != Math.abs(movY - locY)) {
                    throw new Exception("Bishops can only move diagonally.");
                }
            }
        }
        return true;
    }

    @Override
    public boolean checkPath(ChessPiece[][] board, int locX, int locY, int movX, int movY) throws Exception {
        if (movX > locX) {
            if (movY > locY) {
                for (int i = locX; i < movX; i++) {
                    for (int j = locY; j < movY; j++) {
                        if (board[locX][locY] != null)
                            throw new Exception("There is a piece in bishop's path");
                    }
                }
            } else if (movY < locY) {
                for (int i = locX; i < movX; i++) {
                    for (int j = locY; j > movY; j--) {
                        if (board[locX][locY] != null)
                            throw new Exception("There is a piece in bishop's path");
                    }
                }
            }
        }
        if (movX < locX) {
            if (movY > locY) {
                for (int i = locX; i > movX; i--) {
                    for (int j = locY; j < movY; j++) {
                        if (board[locX][locY] != null)
                            throw new Exception("There is a piece in bishop's path");
                    }
                }
            } else if (movY < locY) {
                for (int i = locX; i > movX; i--) {
                    for (int j = locY; j > movY; j--) {
                        if (board[locX][locY] != null)
                            throw new Exception("There is a piece in bishop's path");
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "B" : "b";
    }
}
