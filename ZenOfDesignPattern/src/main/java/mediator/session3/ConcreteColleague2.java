package mediator.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 12:42
 * @description: 具体同事类2
 **/
public class ConcreteColleague2 extends Colleague{
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    // 自有方法 self-method
    public void selfMethod2() {
        // 处理自己的业务逻辑
    }

    // 依赖方法 dep-method
    public void depMethod2() {
        // 处理自己的业务逻辑
        // 自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething2();
    }
}
