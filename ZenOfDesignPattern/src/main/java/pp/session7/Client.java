package pp.session7;

import pp.session1.GamePlayer;
import pp.session1.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-19 10:47
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) throws ClassNotFoundException {
        // 定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
        // 定义一个handler
        InvocationHandler handler = new GamePlayerIH(player);
        // 开始打游戏，记录时间戳
        System.out.println("开始时间是：" + new Date());
        // 获得类加载器
        ClassLoader cl = player.getClass().getClassLoader();
        // 动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, GamePlayer.class.getInterfaces(), handler);
        // 登录
        proxy.login("zhangSan", "password");
        // 开始杀怪
        proxy.killBoss();
        // 升级
        proxy.upgrade();
        // 记录结束游戏时间
        System.out.println("结束时间是：" + new Date());
    }
}
