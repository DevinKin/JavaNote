package cor.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-31 17:15
 * @description: 父亲类
 **/
public class Father implements IHandler{
    // 未出嫁的女儿来请示父亲
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("女儿的请示是：" + women.getRequest());
        System.out.println("父亲的答复是：同意");
    }
}
