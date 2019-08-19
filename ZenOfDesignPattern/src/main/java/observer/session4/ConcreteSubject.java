package observer.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 17:57
 * @description: 具体被观察者
 **/
public class ConcreteSubject extends Subject{
    public void doSomething() {
        super.notifyObservers();;
    }
}
