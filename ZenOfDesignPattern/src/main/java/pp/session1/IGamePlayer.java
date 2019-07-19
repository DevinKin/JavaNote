package pp.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 16:25
 * @description: 游戏玩家接口
 **/
public interface IGamePlayer {
    // 登录游戏
    void login(String user, String password);

    // 杀怪，网络游戏的主要角色
    void killBoss();

    // 升级
    void upgrade();
}
