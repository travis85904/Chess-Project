
public abstract class ChessPiece {
    private Color color;

    public ChessPiece() {

    }

    public ChessPiece(Color color) {
        this.color = color;
    }

    void move(String mv) {

    }

    boolean parseMove(String mv) {
        return true;
    }

    public int[] coordsToArray(String pieceLocation, String desiredLocation) {
        int[] aryCoords = {0, 0};
        pieceLocation.toUpperCase();

        switch (pieceLocation.charAt(0)) {
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
        switch (pieceLocation.charAt(1)){
            case '1':
                aryCoords[0]=0;
                break;
            case '2':
                aryCoords[1]=1;
                break;
        }


        return aryCoords;
    }
}
