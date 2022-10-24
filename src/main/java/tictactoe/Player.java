package tictactoe;
/**
 * This class is a Template for the Player Object
 * <p>
 * This class handles mutating and accessing player symbol "X" or "O"
 * </p>
 * <p>
 * This class also updates the move the user is currently wanting to play
 * </p>
 * @author Wali Temuri - 1183379
 */
public class Player {
    
    private String symbol;
    private int currMove;
     
    /**
     * Sets the symbol of a Player object
     * 
     * Returns void
     * 
     * @param String containing the selected symbol
     * @return void
     */
    public  void setSymbol(String playerSymbol) {

        symbol = playerSymbol;
    }
     /**
     * Sets the currentMove attribute of Player object
     * 
     * Returns void
     * 
     * @param int containing the move Player intends to make
     * @return void
     */
    public void setCurrMove(int move) {

        currMove = move;
    }
     /**
     * Get the symbol of the Player 
     * 
     * Returns String 
     * 
     * @param void
     * @return String containing the symbol of Player 
     */
    public String getSymbol() {
        return symbol;
    }
    /**
     * Prints out the instructions for the Game
     * 
     * Returns int
     * 
     * @param void
     * @return integer containing the move Player intends to make
     */
    public int getCurrMove() {
        return currMove;
    }
}
