package bp.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 15:26
 * @description: 导演类
 **/
public class Director {
    private Builder builder = new ConcreteBuilder();
    // 构建不同的产品
    public Product getAProduct() {
        builder.setPart();
        /*
         * 设置不同的零件，产生不同的产品
         */
        return builder.buildProduct();
    }
}
