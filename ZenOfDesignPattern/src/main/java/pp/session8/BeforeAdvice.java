package pp.session8;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-19 15:02
 * @description: 通知实现类
 **/
public class BeforeAdvice implements IAdvice{
    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了！");
    }
}
