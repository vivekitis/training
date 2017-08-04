/**
 * Created by monis.q on 7/21/2017.
 */
public class CricketScore {

    Television tv;
    Radio radio;
    int runs, wickets;

    CricketScore(){
        radio = new Radio();
        tv = new Television();
        runs = wickets = 0;
        System.out.println("CricketScore: Score initialized to "+getScore()+"\n");
    }

    void incrementRuns(){
        runs++;
        broadcast();
    }

    void incrementWickets(){
        wickets++;
        broadcast();
    }

    String getScore(){
        return runs + "-" + wickets;
    }

    void broadcast(){
        tv.update(getScore());
        radio.radioBroadcasast(getScore());
        System.out.println("Broadcast Complete!\n");
    }
}
