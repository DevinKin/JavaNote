package decorate.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-02 15:04
 * @description: 具体修饰类
 **/
public class ConcreteDecorator2 extends Decorator{
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    private void method2() {
        System.out.println("method2修饰");
    }

    @Override
    public void operate() {
        super.operate();
        this.method2();
    }
}
