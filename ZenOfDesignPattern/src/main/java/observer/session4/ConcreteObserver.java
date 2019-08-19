package observer.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 17:57
 * @description: 具体观察者
 **/
public class ConcreteObserver implements Observer{
    @Override
    public void update() {
        System.out.println("接受到信息，并进行处理！");
    }
}
