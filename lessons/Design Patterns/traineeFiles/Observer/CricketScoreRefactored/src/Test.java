/**
 * Created by monis.q on 7/21/2017.
 */
public class Test {

    public static void main(String[] args) {
        Television tv = new Television();
        Radio radio = new Radio();

        CricketScore cr = new CricketScore();
        cr.addObserver(tv);
        cr.addObserver(radio);

        cr.incrementRuns();
        cr.incrementRuns();
        cr.incrementRuns();
        cr.incrementWickets();
        cr.incrementRuns();
    }
}
