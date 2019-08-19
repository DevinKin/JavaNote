package observer.session5;

import java.util.Observer;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 17:49
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        Observer lisi = new Lisi();
        // 定义出韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
