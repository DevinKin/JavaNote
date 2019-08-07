package strategy.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-06 17:51
 * @description: 锦囊
 **/
public class Context {
    // 构造函数，你要使用哪个妙计
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    // 使用计谋
    public void operate() {
        this.strategy.operate();
    }
}
