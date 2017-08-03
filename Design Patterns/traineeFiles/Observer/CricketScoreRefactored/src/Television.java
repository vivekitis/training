/**
 * Created by monis.q on 7/21/2017.
 */
public class Television implements Observer {
    @Override
    public void update(String score) {
        System.out.println("Television: The score is " + score);
    }
}
