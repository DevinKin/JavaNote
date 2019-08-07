package adapter.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 17:05
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        // 原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        // 现在增加了适配器角色后的业务逻辑
        Target target2 = new Adapter();
        target2.request();
    }
}
