package fmp.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-01 11:54
 * @description: 白色人种
 **/
public class WhiteHuman implements Human {
    public void getColor() {
        System.out.println("白色人种的皮肤都是白色的！");
    }

    public void talk() {
        System.out.println("白色人种会说话，一般都是单字节的。");
    }
}
