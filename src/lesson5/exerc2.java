package lesson5;

public class exerc2 {
    public static void main(String[] args) {

        String[][] board = new String[8][8];

        // заполнение
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if ((i + j) % 2 == 0) {
                    board[i][j] = "W";
                } else {
                    board[i][j] = "B";
                }
            }
        }

        // Идея порекомендовала: for (String[] strings : board) {
        //                       for (String string : strings) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
        }
    }
}
