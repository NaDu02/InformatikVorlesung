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
            if (board[i] == 'r'){
                System.out.print("\u265C");
            } else if (board[i] == 'b') {
                System.out.print("\u265E");
            } else if (board[i] == 'q') {
                System.out.print("\u265B");
            } else if (board[i] == 'k') {
                System.out.print("\u265A");
            } else if (board[i] == 'n') {
                System.out.print("\u265D");
            } else if (board[i] == 'p') {
                System.out.print("\u265F");
            } else if (board[i] == 'R') {
                System.out.print("\u2656");
            } else if (board[i] == 'B') {
                System.out.print("\u2658");
            } else if (board[i] == 'Q') {
                System.out.print("\u2655");
            } else if (board[i] == 'K') {
                System.out.print("\u2654");
            } else if (board[i] == 'N') {
                System.out.print("\u2657");
            } else if (board[i] == 'P') {
                System.out.print("\u2659");
            }
            if (i % 8 == 7){
                System.out.println();
            }
        }

    }

}
