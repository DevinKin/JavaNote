package afp.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-02 11:07
 * @description: 产品B抽象类
 **/
public abstract class AbstractProductB {
    // 每个产品共有的方法
    void shareMethod() {

    }

    // 每个产品相同方法，不同实现
    abstract void doSomething();
}
