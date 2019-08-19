package observer.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 17:49
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        Observer lisi = new Lisi();
        Observer wangSi = new WangSi();
        Observer liuSi = new LiuSi();
        // 定义出韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
