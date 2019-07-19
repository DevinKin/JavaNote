package bp.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 15:22
 * @description: 具体建造者
 **/
public class ConcreteBuilder extends Builder{
    private Product product = new Product();
    @Override
    public void setPart() {
        /*
         * 产品类内的逻辑处理
         */
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
