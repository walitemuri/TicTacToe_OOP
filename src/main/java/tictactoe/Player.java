package tictactoe;

public class Player {
    
    private static String symbol = " ";
    private static int currMove;

    public  void setSymbol(String playerSymbol) {

        symbol = playerSymbol;
    }

    public void setCurrMove (int move) {

        currMove = move;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getCurrMove() {
        return currMove;
    }
}
