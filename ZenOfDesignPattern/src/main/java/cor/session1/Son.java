package cor.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-31 17:23
 * @description: 儿子类
 **/
public class Son implements IHandler{
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("母亲的请示是：" + women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}
