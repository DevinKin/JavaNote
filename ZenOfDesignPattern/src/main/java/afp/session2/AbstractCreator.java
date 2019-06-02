package afp.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-02 11:09
 * @description: 抽象工厂类
 **/
public abstract class AbstractCreator {
    // 创建A产品家族
    abstract AbstractProductA createProductA();

    // 创建B产品家族
    abstract AbstractProductB createProductB();

}
