package observer.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 17:58
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        // 创建一个被观察者
        ConcreteSubject subject = new ConcreteSubject();
        Observer obs = new ConcreteObserver();
        subject.addObserver(obs);
        subject.doSomething();
    }
}
