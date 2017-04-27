
public class ChessBoard {
    private ChessPiece[][] board = new ChessPiece[8][8];

    public ChessBoard() {
        board[0][0] = new Rook(Color.white);
        board[0][1] = new Knight(Color.white);
        board[0][2] = new Bishop(Color.white);
        board[0][3] = new King(Color.white);
        board[0][4] = new Queen(Color.white);
        board[0][5] = new Bishop(Color.white);
        board[0][6] = new Knight(Color.white);
        board[0][7] = new Rook(Color.white);
        board[1][0] = new Pawn(Color.white);
        board[1][1] = new Pawn(Color.white);
        board[1][2] = new Pawn(Color.white);
        board[1][3] = new Pawn(Color.white);
        board[1][4] = new Pawn(Color.white);
        board[1][5] = new Pawn(Color.white);
        board[1][6] = new Pawn(Color.white);
        board[1][7] = new Pawn(Color.white);

        board[6][0] = new Pawn(Color.black);
        board[6][1] = new Pawn(Color.black);
        board[6][2] = new Pawn(Color.black);
        board[6][3] = new Pawn(Color.black);
        board[6][4] = new Pawn(Color.black);
        board[6][5] = new Pawn(Color.black);
        board[6][6] = new Pawn(Color.black);
        board[6][7] = new Pawn(Color.black);
        board[7][0] = new Rook(Color.black);
        board[7][1] = new Knight(Color.black);
        board[7][2] = new Bishop(Color.black);
        board[7][3] = new Queen(Color.black);
        board[7][4] = new King(Color.black);
        board[7][5] = new Bishop(Color.black);
        board[7][6] = new Knight(Color.black);
        board[7][7] = new Rook(Color.black);
    }

    @Override
    public String toString() {
        for (int i = 0; i < 8; i++) {
            for (ChessPiece spot:board[i]) {
                if (spot==null)
                    System.out.println(".");
                System.out.println(spot.toString());
            }
        }
        return board.toString();
    }
}
