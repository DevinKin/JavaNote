package cor.session2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-31 17:23
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        Random rand = new Random();
        List<IWomen> womenList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            womenList.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }
        // 定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNextHandler(husband);
        husband.setNextHandler(son);

        for (IWomen women : womenList) {
            father.HandleMessage(women);
        }
    }
}
