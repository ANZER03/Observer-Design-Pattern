package ma.enset;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();

        observable.subscribe(observer1);
        observable.subscribe(observer2);

        observable.setCount(1);

        observable.unsubscribe(observer1);

        observable.setCount(6);
    }
}