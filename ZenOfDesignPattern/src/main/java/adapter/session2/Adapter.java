package adapter.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 17:06
 * @description: 适配器角色
 **/
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.doSomething();
    }
}
