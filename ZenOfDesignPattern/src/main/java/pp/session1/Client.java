package pp.session1;

import java.util.Date;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 16:34
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");

        System.out.println("开始时间是：" + new Date());
        player.login("zhangsan", "password");
        player.upgrade();
        System.out.println("结束时间是：" + new Date());
    }
}
