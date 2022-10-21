package tictactoe;

public class Board {
    
    private int [][] board = new int[3][3];
    private static int gameState;

    public void getBoard() {

        System.out.println("|---|---|---|");
        System.out.println(printRow(0));
        System.out.println("|---|---|---|");
        System.out.println(printRow(1));
        System.out.println("|---|---|---|");
        System.out.println(printRow(2));
        System.out.println("|---|---|---|");
    }

    private String printRow(int r) {
        StringBuilder newRow = new StringBuilder("| ");

        for(int i = 0; i < 3; i++) {
            if (board[r][i] == 0) {
                newRow.append(" ");
            }
            if (board[r][i] == 1) {
                newRow.append("O");
            }
            if (board[r][i] == 2) {
                newRow.append("X");
            }
        }

        return "";
    }

}
