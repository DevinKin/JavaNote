package bp.session1;

import java.util.ArrayList;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 11:19
 * @description: 客户端代码
 **/
public class Client {
    public static void main(String[] args) {
        BenzModel benz = new BenzModel();
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        // 我们把这个顺序赋予奔驰车
        benz.setSequence(sequence);
        benz.run();
    }
}
