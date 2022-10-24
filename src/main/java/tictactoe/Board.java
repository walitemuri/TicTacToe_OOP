package tictactoe;

public class Board {

    private int[][] board = new int[3][3];

    public void getBoard() {

        System.out.println("|---|---|---|");
        System.out.println(getRow(0));
        System.out.println("|---|---|---|");
        System.out.println(getRow(1));
        System.out.println("|---|---|---|");
        System.out.println(getRow(2));
        System.out.println("|---|---|---|");
    }

    private String getRow(int r) {
        StringBuilder newRow = new StringBuilder("| ");

        for(int i = 0; i < 3; i++) {
            if (board[r][i] == 0) {
                newRow.append("1");
            }
            if (board[r][i] == 1) {
                newRow.append("O");
            }
            if (board[r][i] == 2) {
                newRow.append("X");
            }
            newRow.append(" | ");
        }

        newRow.deleteCharAt(newRow.lastIndexOf(" "));
        return newRow.toString();
    }

    public boolean placePiece(Player player) {

        int position = player.getCurrMove();
        String symbol = player.getSymbol();

        int row = (position - 1) / 3;
        int column = (position - (row * 3)) - 1;

        if (board[row][column] == 0) {

            if (symbol.equals("O")) {
                board[row][column] = 1;
            }

            if (symbol.equals("X")) {
                board[row][column] = 2;
            }

            return true;
        }

        return false;
    }

    public boolean checkCat() {

        int i;
        int j;
        boolean isZero = false;

        for(i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    isZero = true;
                }
            }
        }

        return !isZero;
    }

    public int checkWinner() {
        int i;
        //Checking along Row
        for (i = 0; i < 3; i++) {

            if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != 0) {

                return board[i][0];
            }
        }
        //Checking along Col
        for (i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] != 0) {

                return board[0][i];
            }
        }
        //Checking along Diagonal
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != 0) {

            return board[0][0];
        }
        //Checking inverse Diagonal
        if (board[2][0] == board[1][1] && board[2][0] == board[0][2] && board[2][0] != 0) {
            return board[2][0];
        }

        return -1;
    }

    private boolean isEmpty(int move) {

        int row = (move - 1) / 3;
        int col = (move - (row * 3)) - 1;

        if (board[row][col] == 0) {
            return true;
        }

        return false;
    }

    public boolean isValidMove(Player playerX) {

        int move = playerX.getCurrMove();

        if (move <= 9 && move >= 1) {
            
            if (isEmpty(move)) {
                return true;
            }

            return false;
        } 

        return false;
    }
}
