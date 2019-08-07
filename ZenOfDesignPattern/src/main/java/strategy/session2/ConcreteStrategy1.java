package strategy.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 10:39
 * @description: 具体策略角色1
 **/
public class ConcreteStrategy1 implements Strategy{
    @Override
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
}
