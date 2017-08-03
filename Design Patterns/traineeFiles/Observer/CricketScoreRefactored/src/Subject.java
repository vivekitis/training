/**
 * Created by monis.q on 7/21/2017.
 */
public interface Subject {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
