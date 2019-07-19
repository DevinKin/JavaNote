package bp.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 15:17
 * @description: 客户端类
 **/
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        for (int i = 0; i < 10000; i++) {
            director.getABenzModel().run();
        }
        for (int i = 0; i < 1000000; i++) {
            director.getBBenzModel().run();
        }
        for (int i = 0; i < 10000000; i++) {
            director.getCBMWModel().run();
        }
    }
}
