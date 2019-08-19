package observer.session5;


import java.util.Observable;
import java.util.Observer;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 16:52
 * @description: 观察者
 **/
public class Lisi implements Observer {

    private void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + reportContext);
    }

    @Override
    public void update(Observable observable, Object context) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");
        this.reportToQinShiHuang(context.toString());
        System.out.println("李斯：汇报完毕...\n");
    }
}
