import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ankit.sa on 7/21/2017.
 */
public class Queue {
    private List<Command> morningqueue,eveningqueue;
    Queue(){
        morningqueue = new ArrayList<Command>();
        eveningqueue = new ArrayList<Command>();
    }
    void addmorning(Command verify)
    {
        morningqueue.add(verify);
    }
    List<Command> getmorning()
    {
       return morningqueue;
    }
    void addevening(Command verify)
    {
        eveningqueue.add(verify);
    }
    List<Command> getevening()
    {
        return eveningqueue;
    }
}
