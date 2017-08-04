import java.util.ArrayList;

/**
 * Created by monis.q on 7/21/2017.
 */
public class CricketScore implements Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    int runs, wickets;

    CricketScore(){
        runs = wickets = 0;
        System.out.println("CricketScore: Score initialized to "+getScore()+"\n");
    }

    void incrementRuns(){
        runs++;
        notifyObservers();
    }

    void incrementWickets(){
        wickets++;
        notifyObservers();
    }

    String getScore(){
        return runs + "-" + wickets;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer Add");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying Observers");
        for (Observer ob : observers) {
            ob.update(this.getScore());
        }
        System.out.println("Broadcast Complete!\n");
    }
}
