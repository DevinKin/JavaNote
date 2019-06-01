package fmp.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-01 12:10
 * @description: 具体工厂类
 **/
public class ConcreteCreator extends Creator{
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            // 异常处理
        }
        return (T) product;
    }
}
