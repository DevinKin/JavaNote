package cor.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-31 17:17
 * @description: 丈夫类
 **/
public class Husband extends Handler{
    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }
    // 妻子向丈夫请示

    @Override
    protected void response(IWomen women) {
        System.out.println("妻子的请示是：");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是：同意");
    }
}
