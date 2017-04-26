import sun.text.resources.ja.JavaTimeSupplementary_ja;

public class Bishop extends ChessPiece {
    public Bishop(Color color) {
        super(color);
    }

    public boolean isMoveLegal() {
        return true;
    }
}
