package cor.session1;

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
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();

        for (IWomen women : womenList) {
            if (women.getType() == 1) {
                System.out.println("\n-------女儿向父亲请示-------");
                father.HandleMessage(women);
            } else if (women.getType() == 2) {
                System.out.println("\n-------女儿向丈夫请示-------");
                husband.HandleMessage(women);
            } else if (women.getType() == 3){
                System.out.println("\n-------女儿向儿子请示-------");
                son.HandleMessage(women);
            }
        }
    }
}
