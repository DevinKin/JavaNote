package observer.session4;

import java.util.Vector;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 17:56
 * @description: 被观察者
 **/
public abstract class Subject {
    private Vector<Observer> obsVector = new Vector<>();

    public void addObserver(Observer o) {
        this.obsVector.add(o);
    }

    public void delObserver(Observer o) {
        this.obsVector.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : this.obsVector) {
            o.update();
        }
    }
}
