package observer.session5;

import observer.session3.IHanFeiZi;

import java.util.Observable;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-12 11:33
 * @description: 韩非子类
 **/
public class HanFeiZi extends Observable implements IHanFeiZi {
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }
}
