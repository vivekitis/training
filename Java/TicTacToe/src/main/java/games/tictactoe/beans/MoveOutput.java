package games.tictactoe.beans;

/**
 * Created by ruzbeh.i on 13/07/17.
 */
public class MoveOutput {
    boolean isValid;
    boolean someOneWon;
    String reason;

    public MoveOutput(boolean isValid, boolean someOneWon, String reason) {
        this.isValid = isValid;
        this.someOneWon = someOneWon;
        this.reason = reason;
    }
}
