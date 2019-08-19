package observer.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 16:58
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) throws InterruptedException {
        Lisi lisi = new Lisi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        Spy watchBreakFast = new Spy(hanFeiZi, lisi, "breakfast");
        watchBreakFast.start();
        Spy watchFun = new Spy(hanFeiZi, lisi, "fun");
        watchFun.start();
        Thread.sleep(1000);
        hanFeiZi.haveBreakfast();
        Thread.sleep(1000);
        hanFeiZi.haveFun();
    }
}
