package observer.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 17:34
 * @description: 通过聚集方式的场景类
 **/
public class Client {
    public static void main(String[] args) {
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
