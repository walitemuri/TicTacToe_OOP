package tictactoe;

public class Player {
    
    private static char symbol;
    private static int currMove;

    public  void setSymbol(char playerSymbol) {

        symbol = playerSymbol;
    }

    public void setCurrMove (int move) {

        currMove = move;
    }
}
