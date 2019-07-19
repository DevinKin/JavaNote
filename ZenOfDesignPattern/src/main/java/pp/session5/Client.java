package pp.session5;

import java.util.Date;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 17:33
 * @description: 直接访问真实类
 **/
public class Client {
    public static void main(String[] args) {
        // 定义一个游戏的角色
        IGamePlayer player = new GamePlayer("张三");
        System.out.println("开始时间是：" + new Date());
        player.login("zhangSan", "password");
        player.killBoss();
        player.upgrade();
        System.out.println("结束时间是：" + new Date());
    }
}
