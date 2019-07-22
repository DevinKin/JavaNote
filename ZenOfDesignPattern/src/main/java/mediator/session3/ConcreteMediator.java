package mediator.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 12:45
 * @description: 通用中介者类
 **/
public class ConcreteMediator extends Mediator {

    @Override
    public void doSomething1() {
        // 调用同事类的方法，只要是public方法都可以调用
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
