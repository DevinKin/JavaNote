package fmp.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-01 12:08
 * @description: 抽象工厂类
 **/
public abstract class Creator {
    /**
     * 创建一个产品对象，其输入参数类型可以自行设置
     * 通常为String、Enum、Class等，当然也可以为空
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
