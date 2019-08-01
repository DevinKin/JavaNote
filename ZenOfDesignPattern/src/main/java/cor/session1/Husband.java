package cor.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-31 17:17
 * @description: 丈夫类
 **/
public class Husband implements IHandler{
    // 妻子向丈夫请示
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("妻子的请示是：" + women.getRequest());
        System.out.println("丈夫的答复是：同意");
    }
}
