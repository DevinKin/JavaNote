package pp.session2;

import pp.session1.GamePlayer;
import pp.session1.IGamePlayer;

import java.util.Date;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 16:37
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = new GamePlayerProxy(player);
        System.out.println("开始时间是：" + new Date());
        proxy.login("zhangSan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是：" + new Date());
    }
}
