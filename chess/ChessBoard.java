package chess;

public class ChessBoard {
    private ChessPiece[][] board = new ChessPiece[8][8];

    public ChessBoard() {
        //blah
        board[0][0] = new Rook(Color.white);
        board[0][1] = new Knight(Color.white);
        board[0][2] = new Bishop(Color.white);
        board[0][3] = new King(Color.white);
        board[0][4] = new Queen(Color.white);
        board[0][5] = new Bishop(Color.white);
        board[0][6] = new Knight(Color.white);
        board[0][7] = new Rook(Color.white);

        board[7][0] = new Rook(Color.black);
        board[7][1] = new Knight(Color.black);
        board[7][2] = new Bishop(Color.black);
        board[7][3] = new Queen(Color.black);
        board[7][4] = new King(Color.black);
        board[7][5] = new Bishop(Color.black);
        board[7][6] = new Knight(Color.black);
        board[7][7] = new Rook(Color.black);

        for (int col = 0; col < 8; col++) {
            board[1][col] = new Pawn(Color.white);
        }
        for (int row = 2; row < 6; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = null;
            }
        }
        for (int col = 0; col < 8; col++) {
            board[6][col] = new Pawn(Color.black);
        }
    }

    public ChessPiece getPiece(int x, int y) {
        return board[x][y];
    }

    public void setPiece(int x, int y, ChessPiece piece) {
        board[x][y] = piece;
    }

    public void move(int[] locationAry, int[] moveAry) throws Exception {
        int locX = locationAry[0];//location of the piece to be moved
        int locY = locationAry[1];
        int movX = moveAry[0];//desired location to move the piece to
        int movY = moveAry[1];

        ChessPiece piece = getPiece(locX, locY);

        if (checkSpot(locX, locY, movX, movY)) {
            if (piece.legalMove(board, locX, locY, movX, movY)) {
                if (piece.checkPath(board, locX, locY, movX, movY)) {
                    checkCapture(movX, movY);
                    board[movX][movY] = board[locX][locY];
                    board[locX][locY] = null;
                }
            }
        }
    }

    public void checkCapture(int movX, int movY) {
        if (board[movX][movY] != null) { //Check if there a piece at movX, movY that will be captured
            System.out.println("You captured " + board[movX][movY]);
        }
    }

    public boolean checkSpot(int locX, int locY, int movX, int movY) throws Exception {
        if (movX == locX && movY == locY) { // Make sure the move location is not the same as the piece location
            throw new Exception("ERROR: The piece is already in the specified location");
        } else if (board[locX][locY] == null) { //Check that a piece is at locX, locY
            throw new Exception("ERROR: No piece exists in the specified location");
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            for (ChessPiece spot : board[i]) {
                if (spot == null)
                    //System.out.print(".");
                    sb.append(".");
                    //else System.out.print(spot);
                else sb.append(spot);
            }
            //System.out.println("\n");
            sb.append("\n");
        }
        String board = sb.toString();
        return board;
    }
}
