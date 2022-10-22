package tictactoe;

public class Board {
    
    private int [][] board = new int[3][3];
    private static int gameState;

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
                newRow.append(" ");
            }
            if (board[r][i] == 1) {
                newRow.append("O");
            }
            if (board[r][i] == 2) {
                newRow.append("X");
            }
        }

        newRow.deleteCharAt(newRow.lastIndexOf(" "));
        return newRow.toString();
    }

    public boolean placePiece (Player player) {
        
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

        for(i = 0; i <= 3; i++) {
            for (j = 0; j <= 3; j++) {
                if (board[i][j] == 0) {
                    isZero = true;
                }
            }
        }

        return !isZero;
    }

    public boolean checkWinner (int row, int column) {
        
        int gmeSymbol = board [row][column];

        if(gmeSymbol == 0) {

        return false;

        }

        boolean isCellOutOfRange = (row + 1 > board.length
                                    || row + 2 > board.length - 1);

        if (!isCellOutOfRange && board[row + 1][column] == gmeSymbol 
            && board[row+2][column] == gmeSymbol) {

                return true;

            }
        return true;
    }
}
