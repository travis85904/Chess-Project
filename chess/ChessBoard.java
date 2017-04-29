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

    public ChessPiece getPiece(int[] location){
        int x = location[0];
        int y = location[1];

        return board[x][y];
    }

    public void move(ChessPiece piece, int[] coords){

    }

    @Override
    public String toString() {
        for (int i = 0; i < 8; i++) {
            for (ChessPiece spot : board[i]) {

                if (spot == null)
                    System.out.print(".");
                else System.out.print(spot);
            }
            System.out.println("\n");
        }
        return "";
    }
}
