
public abstract class ChessPiece {
    protected Color color;

    public ChessPiece() {

    }

    public ChessPiece(Color color) {
        this.color = color;
    }

    void move(String mv) {

    }

    public Color getColor(){
        return color;
    }

    boolean parseMove(String mv) {
        return true;
    }

    public int[] coordsToArray(String desiredLocation) {
        int[] aryCoords = {0, 0};
        desiredLocation.toUpperCase();

        switch (desiredLocation.charAt(0)) {
            case 'A':
                aryCoords[1] = 0;
                break;
            case 'B':
                aryCoords[1] = 1;
                break;
            case 'C':
                aryCoords[1] = 2;
                break;
            case 'D':
                aryCoords[1] = 3;
                break;
            case 'E':
                aryCoords[1] = 4;
                break;
            case 'F':
                aryCoords[1] = 5;
                break;
            case 'G':
                aryCoords[1] = 6;
                break;
            case 'H':
                aryCoords[1] = 7;
                break;
        }
        switch (desiredLocation.charAt(1)) {
            case '1':
                aryCoords[0] = 7;
                break;
            case '2':
                aryCoords[0] = 6;
                break;
            case '3':
                aryCoords[0] = 5;
                break;
            case '4':
                aryCoords[0] = 4;
                break;
            case '5':
                aryCoords[0] = 3;
                break;
            case '6':
                aryCoords[0] = 2;
                break;
            case '7':
                aryCoords[0] = 1;
                break;
            case '8':
                aryCoords[0] = 0;
                break;
        }

        return aryCoords;
    }

    @Override
    public String toString() {
        if (color==null)
            return ".";
        return super.toString();
    }
}
