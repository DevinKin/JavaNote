package pp.session5;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 17:22
 * @description: 强制代理的接口类
 **/
public interface IGamePlayer {
    void login(String user, String password);

    void killBoss();

    void upgrade();

    IGamePlayer getProxy();
}
