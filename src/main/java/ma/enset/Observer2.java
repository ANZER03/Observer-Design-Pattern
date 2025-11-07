package ma.enset;

public class Observer2 implements Observer {
    private int count = 0;
    @Override
    public void update(int x) {
        this.count = x;
        System.out.println("Observer2 count = : " + x);
    }
}
