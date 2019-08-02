package decorate.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-02 14:56
 * @description: 具体构件
 **/
public class ConcreteComponent extends Component{
    @Override
    public void operate() {
        System.out.println("do something");
    }
}
