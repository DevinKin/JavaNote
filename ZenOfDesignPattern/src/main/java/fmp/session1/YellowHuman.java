package fmp.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-01 11:53
 * @description: 黄色人种
 **/
public class YellowHuman implements Human{
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的！");
    }

    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节。");
    }
}
