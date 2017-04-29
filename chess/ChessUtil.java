package chess;

public class ChessUtil {

    public static int[] coordsToArray(String desiredLocation) {
        desiredLocation = desiredLocation.toUpperCase();
        int[] aryCoords = {0, 0};

        switch (desiredLocation.charAt(1)) {
            case '1':
                aryCoords[0]=7;
                break;
            case '2':
                aryCoords[0]=6;
                break;
            case '3':
                aryCoords[0]=5;
                break;
            case '4':
                aryCoords[0]=4;
                break;
            case '5':
                aryCoords[0]=3;
                break;
            case '6':
                aryCoords[0]=2;
                break;
            case '7':
                aryCoords[0]=1;
                break;
            case '8':
                aryCoords[0]=0;
                break;
        }
        switch (desiredLocation.charAt(0)) {
            case 'A':
                aryCoords[1]=0;
                break;
            case 'B':
                aryCoords[1]=1;
                break;
            case 'C':
                aryCoords[1]=2;
                break;
            case 'D':
                aryCoords[1]=3;
                break;
            case 'E':
                aryCoords[1]=4;
                break;
            case 'F':
                aryCoords[1]=5;
                break;
            case 'G':
                aryCoords[1]=6;
                break;
            case 'H':
                aryCoords[1]=7;
                break;
        }


        return aryCoords;
    }
//    public static String coordsToArray(String desiredLocation) {
//        int[] aryCoords = {0, 0};
//
//        desiredLocation = desiredLocation.toUpperCase();
//        StringBuilder sb = new StringBuilder();
//        switch (desiredLocation.charAt(1)) {
//            case '1':
//                sb.append('7');
//                break;
//            case '2':
//                sb.append('6');
//                break;
//            case '3':
//                sb.append('5');
//                break;
//            case '4':
//                sb.append('4');
//                break;
//            case '5':
//                sb.append('3');
//                break;
//            case '6':
//                sb.append('2');
//                break;
//            case '7':
//                sb.append('1');
//                break;
//            case '8':
//                sb.append('0');
//                break;
//        }
//        switch (desiredLocation.charAt(0)) {
//            case 'A':
//                sb=sb.append('0');
//                break;
//            case 'B':
//                sb=sb.append('1');
//                break;
//            case 'C':
//                sb=sb.append('2');
//                break;
//            case 'D':
//                sb=sb.append('3');
//                break;
//            case 'E':
//                sb=sb.append('4');
//                break;
//            case 'F':
//                sb=sb.append('5');
//                break;
//            case 'G':
//                sb=sb.append('6');
//                break;
//            case 'H':
//                sb=sb.append('7');
//                break;
//        }
//
//
//        return sb.toString();
//    }
}
