package strategy.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 10:40
 * @description: 具体策略角色2
 **/
public class ConcreteStrategy2 implements Strategy{
    @Override
    public void doSomething() {
        System.out.println("具体策略2的运算法则");
    }
}
