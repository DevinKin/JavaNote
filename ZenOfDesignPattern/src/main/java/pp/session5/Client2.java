package pp.session5;

import java.util.Date;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 17:35
 * @description: 直接访问代理类
 **/
public class Client2 {
    public static void main(String[] args) {
        // 定义一个游戏的角色
        IGamePlayer player = new GamePlayer("张三");
        // 获得指定的代理
        IGamePlayer proxy = player.getProxy();

        System.out.println("开始时间是：" + new Date());
        proxy.login("zhangSan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是：" + new Date());
    }
}
