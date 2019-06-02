package afp.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-02 11:10
 * @description: 产品等级1的实现类
 **/
public class Creator1 extends AbstractCreator{
    // 只生产产品等级为1的A产品
    @Override
    AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB1();
    }
}
