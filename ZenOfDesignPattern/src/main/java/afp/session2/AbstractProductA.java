package afp.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-02 11:05
 * @description: 抽象产品类A
 **/
public abstract class AbstractProductA {
    // 每个产品共有的方法
    void shareMethod() {

    }

    // 每个产品相同方法，不同实现
    abstract void doSomething();
}
