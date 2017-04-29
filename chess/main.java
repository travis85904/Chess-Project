package chess;

import java.util.HashMap;

public class main {
    static HashMap<Character, Integer> coords;
    private static ChessBoard chessBoard = new ChessBoard();

    public static void main(String[] args) {
        System.out.println(chessBoard);
        int ary[] = ChessUtil.coordsToArray("b2");
        System.out.println(ary[0]+":"+ary[1]);
        move("A6", "A6");


    }

    public static void move(String pieceLocation, String move) {

    }
}
