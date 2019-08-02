package decorate.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-02 15:02
 * @description: 具体的装饰类
 **/
public class ConcreteDecorator1 extends Decorator{
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    // 定义自己的修饰方法
    private void method1() {
        System.out.println("method1 修饰");
    }

    // 重写父类的Operation方法

    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}
