//Travis Davis
//Kevin Blair

package chess;

public class main {

    private static ChessBoard chessBoard = new ChessBoard();

    public static void main(String[] args) throws Exception {
        int[] loc = {2,3};
        int[] mov = {4,5};

        System.out.println(chessBoard);
        chessBoard.setPiece(5,3, new Bishop(Color.white));
        move("d3","c2");


        System.out.println(chessBoard);

    }

    public static void move(String pieceLocation, String move) throws Exception {
        int[] locationAry = ChessUtil.coordsToArray(pieceLocation);
        int[] moveAry = ChessUtil.coordsToArray(move);
        chessBoard.move(locationAry, moveAry);

    }
}
