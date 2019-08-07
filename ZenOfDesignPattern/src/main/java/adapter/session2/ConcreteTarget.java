package adapter.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 17:02
 * @description: 目标角色的实现类
 **/
public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("if you need any help, pls call me!");
    }
}
