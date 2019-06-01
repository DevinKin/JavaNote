package fmp.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-01 11:52
 * @description: 黑色人种
 **/
public class BlackHuman implements Human {
    public void getColor() {
        System.out.println("黑色人种的皮肤是黑色的！");
    }

    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }
}
