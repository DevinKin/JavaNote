package decorate.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-02 15:05
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        // 第一次修饰
        component = new ConcreteDecorator1(component);
        // 第二次修饰
        component = new ConcreteDecorator2(component);
        // 修饰后运行
        component.operate();
    }
}
