package After;

import After.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ankit.sa on 7/20/2017.
 */


/** The Invoker class */
public class Switch {
    private List<Command> history = new ArrayList<Command>();

    public void storeAndExecute(final Command cmd) {
        this.history.add(cmd); // optional
        cmd.execute();
    }
    public List<Command> log()
    {
        return history;
    }
}