package cor.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-31 17:23
 * @description: 儿子类
 **/
public class Son extends Handler{
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("母亲的请示是：");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}
