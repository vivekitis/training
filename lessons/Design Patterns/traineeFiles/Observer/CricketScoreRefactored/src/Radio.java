/**
 * Created by monis.q on 7/21/2017.
 */
public class Radio implements Observer {
    @Override
    public void update(String score) {
        System.out.println("Radio: The score is " + score);
    }
}
