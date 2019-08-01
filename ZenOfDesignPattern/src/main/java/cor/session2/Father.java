package cor.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-31 17:15
 * @description: 父亲类
 **/
public class Father extends Handler{
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    // 未出嫁的女儿来请示父亲
    @Override
    protected void response(IWomen women) {
        System.out.println("女儿的请示是：");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是：同意\n");
    }
}
