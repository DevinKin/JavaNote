package cor.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-01 14:50
 * @description: 具体处理者
 **/
public class ConcreteHandler1 extends Handler{
    @Override
    protected Level getHandlerLevel() {
        // 设置自己的处理级别
        return null;
    }

    // 定义自己的处理逻辑
    @Override
    protected Response echo(Request request) {
        // 完成处理逻辑
        return null;
    }
}
