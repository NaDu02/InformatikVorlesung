package Vorlesung_2022_11_17;

public class Forsyth_Edwards_Notation {

    public static void main(String[] args) {

        char[] board = new char[64];

        String fen = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR";
        int k = 0;

        for (int i = 0; i < fen.length(); i++){
            if (fen.substring(i, i + 1).matches("[0-9]")){
                for (int j = 0; j < Integer.parseInt(fen.substring(i, i + 1)); j++){
                    board[k] = ' ';
                    k++;
                }
            } else if (fen.substring(i, i+1).equals("/")) {
                continue;
            } else {
                board[k] = fen.charAt(i);
                k++;
            }
        }

        for (int i = 0; i < board.length; i++){
            switch (board[i]){
                case 'p':
                    System.out.print("♟");
                    break;
                case 'r':
                    System.out.print("♜");
                    break;
                case 'n':
                    System.out.print("♞");
                    break;
                case 'b':
                    System.out.print("♝");
                    break;
                case 'q':
                    System.out.print("♛");
                    break;
                case 'k':
                    System.out.print("♚");
                    break;
                case 'P':
                    System.out.print("♙");
                    break;
                case 'R':
                    System.out.print("♖");
                    break;
                case 'N':
                    System.out.print("♘");
                    break;
                case 'B':
                    System.out.print("♗");
                    break;
                case 'Q':
                    System.out.print("♕");
                    break;
                case 'K':
                    System.out.print("♔");
                    break;
                default:
                    System.out.print(" ");
                    break;
            }
            if (i % 8 == 7){
                System.out.println();
            }
        }

    }

}
