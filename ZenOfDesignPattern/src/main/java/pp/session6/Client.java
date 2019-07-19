package pp.session6;

import pp.session1.GamePlayer;
import pp.session1.IGamePlayer;

import java.util.Date;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 17:15
 * @description: 普通代理的场景类
 **/
public class Client {
    public static void main(String[] args) {
        // 然后再定义一个代练者
        IGamePlayer gamePlayer = new GamePlayer("张三");
        IGamePlayer proxy = new GamePlayerProxy(gamePlayer);
        // 开始打游戏，几下时间戳
        System.out.println("开始时间是：" + new Date());

        proxy.login("zhangSan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是：" + new Date());
    }
}
