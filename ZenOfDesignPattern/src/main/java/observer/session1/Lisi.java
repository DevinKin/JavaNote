package observer.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 16:52
 * @description: 观察者
 **/
public class Lisi implements ILiSi{
    @Override
    public void update(String context) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");
        this.reportToQinShiHuang(context);
        System.out.println("李斯：汇报完毕...\n");
    }

    private void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + reportContext);
    }
}
