package decorate.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-02 15:00
 * @description: 抽象装饰者
 **/
public class Decorator extends Component{
    private Component component = null;

    // 通过构造函数传递被修饰者
    public Decorator(Component component) {
        this.component = component;
    }

    // 委托被修饰这执行
    @Override
    public void operate() {
        this.component.operate();
    }
}
