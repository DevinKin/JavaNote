package mediator.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 11:02
 * @description: 采购管理类
 **/
public class Purchase extends AbstractColleague{
    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }

    // 采购IBM电脑
    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    // 不再采购IBM电脑
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
