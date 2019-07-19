package pp.session4;

import pp.session1.IGamePlayer;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 17:10
 * @description: 普通代理的代理者
 **/
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    // 通过构造函数传递要对谁进行代练
    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            // TODO 异常处理
        }
    }
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
