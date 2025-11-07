package ma.enset;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {

    private int count = 0;
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(observer -> observer.update(count));
    }

    public void setCount(int count) {
        this.count = count;
        this.notifyObservers();
    }
}
