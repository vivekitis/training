import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Ankit.sa on 7/21/2017.
 */
public class VerifierCompany {
    private List<Command> history = new ArrayList<Command>();

    public void storeAndExecute(final Command cmd) {
        this.history.add(cmd); // optional
        cmd.visit();
    }
    public void Run(Queue queue) {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        boolean morning=true,evening = false;
        if(dayOfWeek==6)
        {
            if(morning)
            for(Command command:queue.getmorning()) {
                storeAndExecute(command);
            }
            if(evening)
                for(Command command:queue.getevening()) {
                    storeAndExecute(command);
                }
        }
    }
}
