package chess;

public class main {
//from kevins pc
    private static ChessBoard chessBoard = new ChessBoard();

    public static void main(String[] args) throws Exception {


        chessBoard.setPiece(1,0,null);
        move("a8", "a5");
        System.out.println(chessBoard);
        chessBoard.setPiece(3,1,new Rook(Color.black));
        move("a5", "b5");

        System.out.println(chessBoard);
    }

    public static void move(String pieceLocation, String move) throws Exception {
        int[] locationAry = ChessUtil.coordsToArray(pieceLocation);
        int[] moveAry = ChessUtil.coordsToArray(move);
        chessBoard.move(locationAry, moveAry);

    }
}
