package observer.session2;

import observer.session1.IHanFeiZi;
import observer.session1.ILiSi;
import observer.session1.Lisi;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 17:32
 * @description: 通过聚集方式的被观察者
 **/
public class HanFeiZi implements IHanFeiZi {
    private ILiSi liSi = new Lisi();
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        this.liSi.update("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        this.liSi.update("韩非子在娱乐");
    }
}
